package org.example.nivell2.exercici1.module;


import java.util.List;

@FunctionalInterface
public interface NameFilter {
    List<String> filter(List<String> names);
}