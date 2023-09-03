package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> Myset = new TreeSet<>(thirdSet);
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        firstSet.retainAll(secondSet);
        firstSet.removeAll(Myset);
        thirdSet.addAll(firstSet);

        return thirdSet;
    }
}
