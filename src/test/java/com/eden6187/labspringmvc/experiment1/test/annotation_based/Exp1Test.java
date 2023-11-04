package com.eden6187.labspringmvc.experiment1.test.annotation_based;

import com.eden6187.labspringmvc.experiment1.subject.CustomHeader;
import com.eden6187.labspringmvc.experiment1.subject.Exp1Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(classes = {TestConfig.class})
public class Exp1Test {

    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    MockMvc mockMvc;
    @Autowired
    Exp1Controller exp1Controller;

    @Test
    public void createApplicationContext(){
        assertThat(applicationContext, is(not(nullValue())));
    }

    @Test
    public void shouldConfigureMockMVC(){
        assertThat(applicationContext, is(not(nullValue())));
    }

    @Test
    public void shouldContainsController(){
        assertThat(exp1Controller, is(not(nullValue())));
    }

    @Test
    public void shouldReturn1IfBodyIsEmpty() throws Exception {
        this.mockMvc
        .perform(
                get("/exp1").header(CustomHeader.ONE.getName(), "1")
        ).andExpect(
                status().isOk()
        ).andExpect(
                content().string("1")
        );
    }

    @Test
    public void shouldReturn1EvenIfBodyIsNotEmpty() throws Exception {
        this.mockMvc
                .perform(
                        post("/exp1").header(CustomHeader.ONE.getName(), "1")
                                .param("param1","value1")
                ).andExpect(
                        status().isOk()
                ).andExpect(
                        content().string("1")
                );
    }

}
