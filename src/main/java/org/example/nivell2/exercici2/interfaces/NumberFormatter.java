package org.example.nivell2.exercici2.module;

import java.util.List;

@FunctionalInterface
public interface NumberFormatter {
    String format(List<Integer> numbers);
}