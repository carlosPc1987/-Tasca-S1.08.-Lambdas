package org.example.nivell1.exercici3.application;


import org.example.nivell1.exercici3.module.MonthPrinterService;

public class AppExecutor {

    private final MonthPrinterService monthPrinter;

    public AppExecutor() {
        this.monthPrinter = new MonthPrinterService();
    }

    public void execute() {
        monthPrinter.printMonths();
    }
}