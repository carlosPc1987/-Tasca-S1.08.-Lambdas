package org.example.nivell2.exercici2.interfaces;

import java.util.List;

@FunctionalInterface
public interface NumberFormatter {
    String format(List<Integer> numbers);
}