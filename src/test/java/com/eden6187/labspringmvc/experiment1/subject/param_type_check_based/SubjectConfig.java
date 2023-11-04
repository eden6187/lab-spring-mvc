package com.eden6187.labspringmvc.experiment1.subject.param_type_check_based;

import com.eden6187.labspringmvc.experiment1.subject.Exp1Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SubjectConfig {
    @Bean
    Exp1Controller exp1Controller(){
        return new Exp1Controller();
    }
}
