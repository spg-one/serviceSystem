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
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
public class HomePageTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @BeforeEach// 在测试开始前初始化工作
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test   //测试首页中上半部分，即服务商个人信息获取
    public void testHomePagePersonalInfo() throws Exception {
        MvcResult result = mockMvc.perform(get("/home-page/personal-info").sessionAttr("personId", 1))
                .andReturn();
        System.out.println(result.getResponse().getContentAsString(Charset.forName("UTF-8")));
    }

    @Test   //测试首页中下半部分，即待处理订单获取
    public void testHomePagePendingOrder() throws Exception {
        MvcResult result = mockMvc.perform(get("/home-page/pending-order").sessionAttr("personId", 1))
                .andReturn();
        System.out.println(result.getResponse().getContentAsString(Charset.forName("UTF-8")));
    }
}