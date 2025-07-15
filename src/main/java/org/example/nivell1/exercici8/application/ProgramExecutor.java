package org.example.nivell1.exercici8.application;

import org.example.nivell1.exercici8.module.ReverserService;
import org.example.nivell1.exercici8.interfaces.StringReverser;

public class ProgramExecutor {

    public void executeProgram() {
        StringReverser lambdaReverser = input -> new StringBuilder(input).reverse().toString();
        ReverserService service = new ReverserService(lambdaReverser);
        service.printReversed("barcelona");
    }
}