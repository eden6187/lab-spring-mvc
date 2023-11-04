package com.eden6187.labspringmvc.experiment1.subject.param_type_check_based;

import com.eden6187.labspringmvc.experiment1.subject.CustomHeader;
import com.eden6187.labspringmvc.experiment1.subject.CustomHeaderWrapper;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class ParameterTypeCheckBasedHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().equals(CustomHeaderWrapper.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory){
        Iterator<String> headerNames = webRequest.getHeaderNames();
        Map<CustomHeader, String> headerMap = new HashMap<>();
        while(headerNames.hasNext()){
            String next = headerNames.next();
            Optional<CustomHeader> named = CustomHeader.named(next);
            named.ifPresent(customHeader -> headerMap.put(customHeader, webRequest.getHeader(next)));
        }
        return new CustomHeaderWrapper(headerMap);
    }
}
