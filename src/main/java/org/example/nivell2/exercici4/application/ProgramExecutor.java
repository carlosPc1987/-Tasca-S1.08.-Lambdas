package org.example.nivell2.exercici4.application;

import org.example.nivell2.exercici4.module.MixedDataProcessor;

import java.util.Arrays;
import java.util.List;

public class ProgramExecutor {

    public void executeProgram() {
        List<String> data = Arrays.asList("apple", "123", "banana", "45", "elephant", "true", "cake", "78", "Zoo");

        MixedDataProcessor processor = new MixedDataProcessor();

        System.out.println("-- Sorted by first character --");
        processor.sortByFirstCharacter(data).forEach(System.out::println);

        System.out.println("\n-- Strings with 'e' first --");
        processor.sortWithEPriority(data).forEach(System.out::println);

        System.out.println("\n-- Replace 'a' with '4' --");
        processor.replaceAWith4(data).forEach(System.out::println);

        System.out.println("\n-- Numeric values only --");
        processor.filterNumericStrings(data).forEach(System.out::println);
    }
}