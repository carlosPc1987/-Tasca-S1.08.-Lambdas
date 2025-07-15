package org.example.nivell1.exercici1.module;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilterService {

    public List<String> filterByLetterO(List<String> inputList) {
        return inputList.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .toList();
    }
}
