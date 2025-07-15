package org.example.nivell2.exercici3.module;


import org.example.nivell2.exercici3.interfaces.Operation;

public class OperationService {

    private final Operation operation;

    public OperationService(Operation operation) {
        this.operation = operation;
    }

    public void printResult(String label) {
        System.out.println(label + ": " + operation.operate());
    }
}