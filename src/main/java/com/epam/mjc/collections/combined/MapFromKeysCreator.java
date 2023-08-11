package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> results = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Integer key =entry.getKey().length();
            if (!results.containsKey(key) ){
                results.put(key, new HashSet<>(List.of(entry.getKey())));
            }else{
                results.get(key).add(entry.getKey());
            }
        }
        return results;
    }

}