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
                session.removeAttribute("personId");
            }
            sessions.clear();
        }
        public synchronized boolean removeSession(String sessionId) {
            int length = sessions.size();
            for (int i = 0; i < length ; i++) {
                if (sessions.get(i).getId().equals(sessionId)) {
                    HttpSession session = sessions.remove(i);
                    session.removeAttribute("personId");
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
    private ConcurrentHashMap<Integer,Context> contextMap;

    private MySessionContext() {
        contextMap = new ConcurrentHashMap<Integer,Context>();
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
    public synchronized boolean addSession(Integer personId, HttpSession session) {
        if (personId != null) {
            Context context = contextMap.get(personId);
            if (context==null) {
                context = new Context();
                contextMap.put(personId,context);
                return context.addSession(session);
            } else {
                return context.addSession(session);
            }
        } else {
            return false;
        }
    }

    public synchronized boolean delSession(Integer personId,String sessionId) {
        Context context = contextMap.get(personId);
        if (context != null) {
            return context.removeSession(sessionId);
        } else {
            return false;
        }
    }

    public synchronized Context getContext (Integer personId) {
        if(personId==null) {
            return null;
        }
        Context context = contextMap.get(personId);
        if (context == null) {
            context = new Context();
            contextMap.put(personId,context);
            return context;
        } else {
            return context;
        }
    }
}