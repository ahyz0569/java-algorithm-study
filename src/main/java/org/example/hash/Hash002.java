package org.example.hash;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hash002 {
    public String solution() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";

        Map<String, Long> partMap = Arrays.stream(participant).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> compMap = Arrays.stream(completion).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> partEntry : partMap.entrySet()) {
            if (!compMap.containsKey(partEntry.getKey())) return partEntry.getKey();

            if (compMap.get(partEntry.getKey()) < partEntry.getValue()) return partEntry.getKey();
        }

        return answer;
    }
}
