package org.example.nivell2.exercici4.module;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MixedDataProcessor {

    public List<String> sortByFirstCharacter(List<String> input) {
        return input.stream()
                .filter(s -> !s.isEmpty())
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .collect(Collectors.toList());
    }

    public List<String> sortWithEPriority(List<String> input) {
        return input.stream()
                .sorted((s1, s2) -> {
                    boolean s1HasE = s1.contains("e");
                    boolean s2HasE = s2.contains("e");
                    if (s1HasE == s2HasE) return 0;
                    return s1HasE ? -1 : 1;
                })
                .collect(Collectors.toList());
    }

    public List<String> replaceAWith4(List<String> input) {
        return input.stream()
                .map(s -> s.contains("a") ? s.replace("a", "4") : s)
                .collect(Collectors.toList());
    }

    public List<String> filterNumericStrings(List<String> input) {
        return input.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());
    }
}