package org.example.nivell2.exercici2.module;

import org.example.nivell2.exercici2.interfaces.NumberFormatter;

import java.util.List;

public class FormatterService {

    private final NumberFormatter formatter;

    public FormatterService(NumberFormatter formatter) {
        this.formatter = formatter;
    }

    public void printFormattedOutput(List<Integer> numbers) {
        String result = formatter.format(numbers);
        System.out.println("Formatted output: " + result);
    }
}
