package org.example.nivell1.exercici4.module;

import java.util.Arrays;
import java.util.List;

public class MonthPrinterService {

    public void printMonths() {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        months.forEach(System.out::println);
    }
}
