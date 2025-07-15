package org.example.nivell1.exercici6.module;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DataSorter {

    public List<String> sortByTextLength(List<Object> elements) {
        List<String> strings = elements.stream()

                .map(Object::toString)
                .filter(e -> e instanceof String)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        return strings;
    }
}

