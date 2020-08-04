package com.adufeitian.servicesystem.config;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {
    @Autowired
    private HttpDomainArgumentResolver httpDomainArgumentResolver;
    // static {
    //     System.out.println("static!");
    // }
    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(httpDomainArgumentResolver);
        System.out.println("httpDomainArgumentResolver added!");
    }
    @Bean
    public testBean testbean(){
        return new testBean();
    }

}


