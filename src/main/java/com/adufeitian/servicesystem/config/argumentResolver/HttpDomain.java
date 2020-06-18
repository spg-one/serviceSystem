package com.adufeitian.servicesystem.config.argumentResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

public class HttpDomain {

    public HttpServletRequest request;

    public HttpServletResponse response;

    public HttpSession session;

    private HashMap responseBody;

    public void setStatus(int status) {
        this.response.setStatus(status);
    }

    public void put(Object key, Object value) {
        if ( responseBody == null) {
            this.responseBody = new HashMap();
        }
        this.responseBody.put(key, value);
    }

    public boolean remove(Object key) {
        if ( responseBody == null ) {
            return false;
        }
        if (responseBody.remove(key) == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object get(Object key) {
        if ( responseBody == null ) {
            return null;
        }
        return responseBody.get(key);
    }

    public HashMap getResponseBody() {
        return this.responseBody;
    }
}
