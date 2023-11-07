package com.eden6187.labspringmvc.experiment2.test;

import com.eden6187.labspringmvc.experiment2.subject.SubjectConfig;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ImportAutoConfiguration({WebMvcAutoConfiguration.class, MockMvcAutoConfiguration.class})
@Import(SubjectConfig.class)
public class TestConfig {
}
