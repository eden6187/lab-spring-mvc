package com.eden6187.labspringmvc.experiment2.test;

import com.eden6187.labspringmvc.experiment2.subject.*;
import com.eden6187.labspringmvc.experiment2.test.TestConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Slf4j
@SpringBootTest(classes = {TestConfig.class})
public class Exp2Test {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ConversionService customConversionService;

    @Test
    public void createApplicationContext(){
        assertThat(applicationContext, is(not(nullValue())));
    }

    @Test
    public void hasDefaultConversionService(){
        assertThat(customConversionService, is(not(nullValue())));
    }

    @Test
    public void convertTestA(){
        Output resultA = customConversionService.convert(new InputSubTypeA(), Output.class);
        assertThat(resultA.getClass(), is(OutputSubTypeA.class));
        log.info(resultA.getClass().getTypeName());
        Output resultB = customConversionService.convert(new InputSubTypeB(), Output.class);
        assertThat(resultB.getClass(), is(OutputSubTypeB.class));
        log.info(resultB.getClass().getTypeName());
    }

}
