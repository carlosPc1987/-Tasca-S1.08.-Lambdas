package org.example.nivell2.exercici1.module;

import org.example.nivell2.exercici1.interfaces.NameFilter;

import java.util.List;

public class FilterService {

    private final NameFilter filter;

    public FilterService(NameFilter filter) {
        this.filter = filter;
    }

    public void printFilteredNames(List<String> names) {
        List<String> result = filter.filter(names);
        System.out.println("Filtered names: " + result);
    }
}
