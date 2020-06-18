package com.adufeitian.servicesystem.config.argumentResolver;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component
public class HttpDomainArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        if(parameter.hasParameterAnnotation(HttpDomainArgument.class)) {
            return true;
        }
        else if (parameter.getMethodAnnotation(HttpDomainArgument.class) != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpDomain httpDomain = new HttpDomain();
        httpDomain.request = (HttpServletRequest) webRequest.getNativeRequest();
        httpDomain.response = (HttpServletResponse) webRequest.getNativeResponse();
        httpDomain.session = httpDomain.request.getSession(true);
        if (httpDomain.session.getAttribute("userId")!=null) {
            httpDomain.session.setAttribute("activated",new Date().getTime());
        }
        return httpDomain;
    }
}
