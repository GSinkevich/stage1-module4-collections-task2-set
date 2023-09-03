package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (var i : sourceList) {
            result.add(i);
           if (i%2 != 0){
               result.add(i*2);
           }
           else {
               int res = i/2;
                while (res != 1){
                    result.add(res);
                    res = res/2;
                }
                result.add(res);
           }
        }
        return  result;
    }
}
