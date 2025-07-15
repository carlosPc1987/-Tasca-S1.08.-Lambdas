package org.example.nivell1.exercici5.module;


import org.example.nivell1.exercici5.interfaces.PiValueProvider;

public class PiValueService {

    private final PiValueProvider piProvider;

    public PiValueService(PiValueProvider piProvider) {
        this.piProvider = piProvider;
    }

    public void printPiValue() {
        System.out.println("Pi Value: " + piProvider.getPiValue());
    }
}
