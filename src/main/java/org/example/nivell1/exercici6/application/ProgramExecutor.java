package org.example.nivell1.exercici6.application;

import org.example.nivell1.exercici6.module.DataSorter;

import java.util.Arrays;
import java.util.List;

public class ProgramExecutor {

    public void executeProgram() {
        List<Object> mixedList = Arrays.asList("pear", 123, "banana", "kiwi", 456, "apple", "fig", 789);

        DataSorter sorter = new DataSorter();
        List<String> sortedStrings = sorter.sortByTextLength(mixedList);

        System.out.println("Sorted strings by length: " + sortedStrings);
    }
}