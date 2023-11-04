package com.eden6187.labspringmvc.experiment1.subject;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
@Getter
public enum CustomHeader {
    ONE("X-One");

    private final String name;

    public static Optional<CustomHeader> named(String name){
        return Arrays.stream(CustomHeader.values()).filter(
                customEnum -> customEnum.name.equalsIgnoreCase(name)
        ).findFirst();
    }
}
