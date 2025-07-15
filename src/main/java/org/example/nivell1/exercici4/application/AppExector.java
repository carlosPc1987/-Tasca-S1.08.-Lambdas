package org.example.nivell1.exercici4.application;

import org.example.nivell1.exercici4.module.MonthPrinterService;

public class AppExector {


    public static class AppExecutor {

        private final MonthPrinterService monthPrinter;

        public AppExecutor() {
            this.monthPrinter = new MonthPrinterService();
        }

        public void execute() {
            monthPrinter.printMonths();
        }
    }
}
