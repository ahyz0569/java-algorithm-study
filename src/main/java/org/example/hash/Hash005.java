package org.example.hash;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 문제: 베스트앨범
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42579
 * */
public class Hash005 {
    public int[] solution(String[] genres, int[] plays) {
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

        List<String> genreOfTop = genreOfTotalPlaysMap.entrySet()
                                                      .stream()
                                                      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                      .map(Map.Entry::getKey)
                                                      .collect(Collectors.toList());

        for (String genre : genreOfTop) {
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
