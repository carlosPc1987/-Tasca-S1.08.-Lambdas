package org.example.nivell1.exercici8.module;

import org.example.nivell1.exercici8.interfaces.StringReverser;

public class ReverserService {

    private final StringReverser reverser;

    public ReverserService(StringReverser reverser) {
        this.reverser = reverser;
    }

    public void printReversed(String original) {
        String result = reverser.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + result);
    }
}