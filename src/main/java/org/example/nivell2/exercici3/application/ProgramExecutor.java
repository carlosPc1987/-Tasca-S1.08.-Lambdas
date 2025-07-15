package org.example.nivell2.exercici3.application;


import org.example.nivell2.exercici3.interfaces.Operation;
import org.example.nivell2.exercici3.module.OperationService;

import java.util.Scanner;

public class ProgramExecutor {

    public void executeProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float b = scanner.nextFloat();

        Operation sum = () -> a + b;
        Operation subtract = () -> a - b;
        Operation multiply = () -> a * b;
        Operation divide = () -> b != 0 ? a / b : Float.NaN;

        new OperationService(sum).printResult("SUM");
        new OperationService(subtract).printResult("SUBTRACTION");
        new OperationService(multiply).printResult("MULTIPLICATION");
        new OperationService(divide).printResult("DIVISION");

        scanner.close();
    }
}