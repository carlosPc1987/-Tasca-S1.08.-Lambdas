package org.example.nivell2.exercici1.application;

import org.example.nivell2.exercici1.module.FilterService;
import org.example.nivell2.exercici1.interfaces.NameFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramExecutor {

    public void executeProgram() {
        List<String> names = Arrays.asList("Ana", "Ada", "Albert", "Joan", "Art", "Ali", "Anna", "Aix", "Leo");

        NameFilter lambdaFilter = list -> list.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());

        FilterService service = new FilterService(lambdaFilter);
        service.printFilteredNames(names);
    }
}