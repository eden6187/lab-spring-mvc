package com.eden6187.labspringmvc.experiment1.test.param_type_check_based;

import com.eden6187.labspringmvc.experiment1.subject.param_type_check_based.SubjectConfig;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ImportAutoConfiguration({WebMvcAutoConfiguration.class, MockMvcAutoConfiguration.class})
@Import({SubjectConfig.class})
public class TestConfig {
}
