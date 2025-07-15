package org.example.nivell1.exercici7.module;

import java.util.List;
import java.util.stream.Collectors;

public class DataSorter {

    public List<Object> sortByTextLengthDescending(List<Object> elements) {
        return elements.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());
    }
}