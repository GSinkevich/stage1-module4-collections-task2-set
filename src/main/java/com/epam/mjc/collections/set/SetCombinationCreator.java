package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> Myset = new TreeSet<>();
        Myset.addAll(firstSet);
        Myset.addAll(secondSet);

       firstSet.retainAll(secondSet);  // general first and second set
       firstSet.removeAll(thirdSet);
       thirdSet.removeAll(Myset);
       firstSet.addAll(thirdSet);
        return firstSet;
    }
}
