package com.eden6187.labspringmvc.experiment1.subject;

import com.eden6187.labspringmvc.experiment1.subject.annotaion_based.BindCustomHeader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exp1Controller {
    @GetMapping("/exp1")
    public String exp1(@BindCustomHeader CustomHeaderWrapper customHeaderWrapper){
        return customHeaderWrapper.getHeaders().get(CustomHeader.ONE);
    }

    @PostMapping("/exp1")
    public String exp2(@BindCustomHeader CustomHeaderWrapper customHeaderWrapper){
        return customHeaderWrapper.getHeaders().get(CustomHeader.ONE);
    }
}
