package org.example.nivell1.exercici7.application;

import org.example.nivell1.exercici7.module.DataSorter;

import java.util.Arrays;
import java.util.List;

public class ProgramExecutor {

    public void executeProgram() {
        List<Object> mixedList = Arrays.asList("pear", 123, "banana", "kiwi", 456, "apple", "fig", 789);

        DataSorter sorter = new DataSorter();
        List<Object> sortedStrings = sorter.sortByTextLengthDescending(mixedList);

        System.out.println("Strings sorted from longest to shortest: " + sortedStrings);
    }
}