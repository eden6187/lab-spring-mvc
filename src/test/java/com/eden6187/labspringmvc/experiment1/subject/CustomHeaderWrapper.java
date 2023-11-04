package com.eden6187.labspringmvc.experiment1.subject;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
@Getter
public class CustomHeaderWrapper {
    private final Map<CustomHeader, String> headers;
}
