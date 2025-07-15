package org.example.nivell2.exercici2.application;

import org.example.nivell2.exercici2.module.FormatterService;
import org.example.nivell2.exercici2.interfaces.NumberFormatter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramExecutor {

    public void executeProgram() {
        List<Integer> inputNumbers = Arrays.asList(3, 55, 44, 12, 7, 8);

        NumberFormatter lambdaFormatter = list -> list.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));

        FormatterService service = new FormatterService(lambdaFormatter);
        service.printFormattedOutput(inputNumbers);
    }
}