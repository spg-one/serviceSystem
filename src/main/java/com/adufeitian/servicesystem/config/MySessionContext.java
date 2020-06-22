package com.adufeitian.servicesystem.config;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class MySessionContext {
    public class Context {
        private volatile List<HttpSession> sessions = new ArrayList<>();
        private ReentrantLock globalSourceLock = new ReentrantLock();
        public synchronized void removeAllSession() {
            for (HttpSession session : sessions) {
                session.removeAttribute("userId");
            }
            sessions.clear();
        }
        public synchronized boolean removeSession(String sessionId) {
            int length = sessions.size();
            for (int i = 0; i < length ; i++) {
                if (sessions.get(i).getId().equals(sessionId)) {
                    HttpSession session = sessions.remove(i);
                    session.removeAttribute("userId");
                    return true;
                }
            }
            return false;
        }
        public synchronized boolean addSession(HttpSession session) {
            if (sessions.size()<MyConfiguration.USER_MAX_ONLINE) {
                sessions.add(session);
                return true;
            } else {
                return false;
            }
        }

        public synchronized List<HttpSession> getSessions() {
            return sessions;
        }

        public synchronized void setSessions(List<HttpSession> sessions) {
            this.sessions = sessions;
        }

        public synchronized ReentrantLock getGlobalSourceLock() {
            return globalSourceLock;
        }

        public synchronized void setGlobalSourceLock(ReentrantLock globalSourceLock) {
            this.globalSourceLock = globalSourceLock;
        }
    }

    private volatile static MySessionContext instance;
    private ConcurrentHashMap<Long,Context> contextMap;

    private MySessionContext() {
        contextMap = new ConcurrentHashMap<Long,Context>();
    }
    public synchronized static MySessionContext getInstance() {
        if (instance == null) {
            instance = new MySessionContext();
        }
        return instance;
    }
    public ConcurrentHashMap getContexMap() {
        return contextMap;
    }
    public synchronized boolean addSession(Long userId, HttpSession session) {
        if (userId != null) {
            Context context = contextMap.get(userId);
            if (context==null) {
                context = new Context();
                contextMap.put(userId,context);
                return context.addSession(session);
            } else {
                return context.addSession(session);
            }
        } else {
            return false;
        }
    }

    public synchronized boolean delSession(Long userId,String sessionId) {
        Context context = contextMap.get(userId);
        if (context != null) {
            return context.removeSession(sessionId);
        } else {
            return false;
        }
    }

    public synchronized Context getContext (Long userId) {
        if(userId==null) {
            return null;
        }
        Context context = contextMap.get(userId);
        if (context == null) {
            context = new Context();
            contextMap.put(userId,context);
            return context;
        } else {
            return context;
        }
    }
}