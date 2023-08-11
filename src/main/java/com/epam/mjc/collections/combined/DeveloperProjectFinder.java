package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Set<String> projectSet = new HashSet<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            for (String projectDeveloper : entry.getValue()) {
                if (projectDeveloper.equals(developer)) {
                    projectSet.add(entry.getKey());
                }
            }
        }
        List<String> results = new ArrayList<>(projectSet);
        results.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() < o2.length()) {
                return 1;
            } else {
                return o2.compareTo(o1);
            }
        });
        return results;
    }
}
