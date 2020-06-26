package com.adufeitian.servicesystem;

import com.adufeitian.servicesystem.security.PasswordCipher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
public class LoginTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @BeforeEach// 在测试开始前初始化工作
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testLogin() throws Exception {
        MultiValueMap map = new LinkedMultiValueMap();
        map.add("username","xyb");
        map.add("password","123456");
        //Get请求
        MvcResult result = mockMvc.perform(post("/login/login-post").params(map))
                .andReturn();
        System.out.println(result.getResponse().getContentAsString(Charset.forName("UTF-8")));
    }

    @Test
    public void testLogout() throws Exception {
        MvcResult result = mockMvc.perform(get("/login/logout"))
                .andReturn();
        System.out.println(result.getResponse().getContentAsString(Charset.forName("UTF-8")));
    }

}
