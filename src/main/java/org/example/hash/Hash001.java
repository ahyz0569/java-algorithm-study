package org.example.hash;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 해시 유형 문제 : 폰켓몬
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * */
public class Hash001 {
    public int solution(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++ ){
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        /**
         * stream 을 이용한 방법
         * Map<Integer, Long> map = Arrays.stream(nums).boxed()
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        */

        return Math.min(map.size(), (nums.length / 2));

    }
}
