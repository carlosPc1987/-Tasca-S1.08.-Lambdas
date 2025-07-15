package org.example.nivell1.exercici1.application;


import org.example.nivell1.exercici1.module.StringFilterService;

import java.util.Arrays;
import java.util.List;

public class AppExecutor {

    private final StringFilterService filterService;

    public AppExecutor() {
        this.filterService = new StringFilterService();
    }

    public void execute() {
        List<String> input = Arrays.asList("Barcelona", "Madrid", "London", "Paris", "Rome", "Berlin", "Oslo");

        List<String> filtered = filterService.filterByLetterO(input);

        System.out.println("Strings containing the letter 'o':");
        filtered.forEach(System.out::println);
    }
}
