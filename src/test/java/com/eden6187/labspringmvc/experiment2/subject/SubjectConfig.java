package com.eden6187.labspringmvc.experiment2.subject;

import com.eden6187.labspringmvc.experiment1.subject.Exp1Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Configuration
@ComponentScan
public class SubjectConfig {
    @Bean("customConversionService")
    ConversionService customConversionService(){
        DefaultConversionService defaultConversionService = new DefaultConversionService();
        defaultConversionService.addConverter(InputSubTypeA.class, Output.class, source -> new OutputSubTypeA());
        defaultConversionService.addConverter(InputSubTypeB.class, Output.class, source -> new OutputSubTypeB());
        return defaultConversionService;
    }
}
