package com.adufeitian.servicesystem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
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
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderTest {
    private MockMvc mockMvc;
    private MockHttpSession session;
    @Autowired
    private WebApplicationContext wac;

    @BeforeAll// 在测试开始前初始化工作
    public void setup() throws Exception{
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        this.session = new MockHttpSession();
        MultiValueMap map = new LinkedMultiValueMap();
        map.add("user_name","xyb");
        map.add("password","123456");
        //Get请求
        MvcResult result = mockMvc.perform(post("/login/login-post").params(map).session(session)).andReturn();
    }

    @Test
    public void getPaddingOrder() throws Exception {
        MvcResult result = mockMvc.perform(get("/order/get-pending-order").session(session)).andReturn();
        System.out.println(result.getResponse().getContentAsString(Charset.forName("UTF-8")));
    }

    @Test
    public void getAcceptedOrder() throws Exception {
        MvcResult result = mockMvc.perform(get("/order/get-accepted-order").session(session)).andReturn();
        System.out.println(result.getResponse().getContentAsString(Charset.forName("UTF-8")));
    }

}
