package org.example.hash;

import java.util.*;
import java.util.stream.Collectors;

public class Hash005 {
    public int[] solution() {
//        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        String[] genres = {"A", "A", "B", "A", "B", "B"};

//        int[] plays = {500, 600, 150, 800, 2500};
        int[] plays = {5, 5, 6, 5, 7, 7};

        List<Integer> answer = new ArrayList<>();

        Map<String, Map<Integer, Integer>> genreOfPriorityMap = new HashMap<>();
        Map<String, Integer> genreOfTotalPlaysMap = new HashMap<>();

        for (int i = 0; i < plays.length; i++) {
            if (genreOfTotalPlaysMap.containsKey(genres[i])) {
                genreOfTotalPlaysMap.put(genres[i], genreOfTotalPlaysMap.get(genres[i]) + plays[i]);
            } else {
                genreOfTotalPlaysMap.put(genres[i], plays[i]);
            }

            if (genreOfPriorityMap.containsKey(genres[i])) {
                Map<Integer, Integer> map = genreOfPriorityMap.get(genres[i]);
                map.put(i, plays[i]);

                genreOfPriorityMap.put(genres[i], map);
            } else {
                genreOfPriorityMap.put(genres[i], new HashMap<>(Map.of(i, plays[i])));
            }
        }

        List<String> genreOfTop2 = genreOfTotalPlaysMap.entrySet()
                                                       .stream()
                                                       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                       .map(Map.Entry::getKey)
                                                       .collect(Collectors.toList());

        for (String genre : genreOfTop2) {
            List<Integer> indexOfPlays = genreOfPriorityMap.get(genre)
                                                           .entrySet()
                                                           .stream()
                                                           .sorted(Map.Entry.<Integer, Integer>comparingByValue(
                                                                   Comparator.reverseOrder())
                                                                            .thenComparing(Map.Entry.comparingByKey()))
                                                           .limit(2)
                                                           .map(Map.Entry::getKey)
                                                           .collect(Collectors.toList());

            answer.addAll(indexOfPlays);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
