package org.example.nivell1.exercici2.application;

import org.example.nivell1.exercici2.module.StringFilterService;

import java.util.Arrays;
import java.util.List;

public class AppExecutor {

    private final StringFilterService filterService;

    public AppExecutor() {
        this.filterService = new StringFilterService();
    }

    public void execute() {
        List<String> cities = Arrays.asList("Barcelona", "Roma", "Oslo", "London", "Paris", "Lisboa", "Copenhaguen");

        List<String> result = filterService.filterByOLetterAndLength(cities);

        System.out.println("Strings containing 'o' and longer than 5 letters:");
        result.forEach(System.out::println);
    }
}
