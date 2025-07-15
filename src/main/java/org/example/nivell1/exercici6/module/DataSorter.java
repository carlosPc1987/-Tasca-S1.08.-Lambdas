package org.example.nivell1.exercici6.module;

import java.util.List;
import java.util.stream.Collectors;

public class DataSorter {

    public List<Object> sortByTextLength(List<Object> elements) {
        return elements.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
    }
}
