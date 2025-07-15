package org.example.nivell1.exercici2.module;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilterService {

    public List<String> filterByOLetterAndLength(List<String> inputList) {
        return inputList.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
    }
}