package com.adufeitian.servicesystem;

import com.adufeitian.servicesystem.config.WebMvcConfiguration;
import com.adufeitian.servicesystem.config.testBean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ContextTest { 
    @Autowired
    ApplicationContext ac;
    @Test
    public void test01(){
       String[] beans =  ac.getBeanDefinitionNames();
       for (String a : beans){
           System.out.println("bean: " + a);
       }
    }

    @Test
    public void test02(){
        

        
        testBean tb = (testBean) ac.getBean("testbean");
        tb.sayHello();
    }
}