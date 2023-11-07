package com.eden6187.labspringmvc.experiment2.subject;


import org.springframework.core.convert.converter.Converter;

public class CustomCoverter implements Converter<Input, Output> {
    @Override
    public Output convert(Input source) {
        return new Output();
    }
}
