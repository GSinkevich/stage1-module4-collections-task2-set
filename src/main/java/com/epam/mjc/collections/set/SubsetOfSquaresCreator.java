package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> list = new TreeSet<>();
        for (var c : sourceList) {
            list.add((int) c * c);
        }
        return list.subSet(lowerBound, true, upperBound, true);

    }
}

