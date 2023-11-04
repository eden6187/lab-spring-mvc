package com.eden6187.labspringmvc.experiment1.subject.param_type_check_based;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfigParameterTypeCheckBased implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new ParameterTypeCheckBasedHandlerMethodArgumentResolver());
    }
}