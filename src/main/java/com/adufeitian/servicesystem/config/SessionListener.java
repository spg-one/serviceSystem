package com.adufeitian.servicesystem.config;

import org.springframework.context.annotation.Configuration;

import javax.servlet.http.*;

@Configuration
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    private MySessionContext msc = MySessionContext.getInstance();
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        Integer personId = (Integer) session.getAttribute("personId");
        if ( personId != null ) {
            msc.delSession(personId,se.getSession().getId());
        }
    }
}
