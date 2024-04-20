package org.example.hash;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 문제 : 완주하지 못한 선수
 * 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class Hash002 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Long> partMap = Arrays.stream(participant)
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> compMap = Arrays.stream(completion)
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> partEntry : partMap.entrySet()) {
            if (!compMap.containsKey(partEntry.getKey())) return partEntry.getKey();

            if (compMap.get(partEntry.getKey()) < partEntry.getValue()) return partEntry.getKey();
        }

        return answer;
    }
}
