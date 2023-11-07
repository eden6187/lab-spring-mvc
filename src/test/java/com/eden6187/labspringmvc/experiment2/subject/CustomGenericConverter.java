package com.eden6187.labspringmvc.experiment2.subject;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.core.convert.converter.GenericConverter;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class CustomGenericConverter implements ConditionalGenericConverter {
    Set<ConvertiblePair> set = new HashSet<>();

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return null;
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        return null;
    }

    @Override
    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return sourceType.isAssignableTo(TypeDescriptor.valueOf(Input.class)) && targetType.isAssignableTo(TypeDescriptor.valueOf(Output.class));
    }
}
