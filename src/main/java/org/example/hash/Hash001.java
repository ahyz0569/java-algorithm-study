package org.example.hash;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hash001 {
    public int solution() {
        int[] nums = {3,3,3,2,2,4};

        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++ ){
            if (map2.containsKey(nums[i])) {
                map2.put(nums[i], map2.get(nums[i]) + 1);
            } else {
                map2.put(nums[i], 1);
            }
        }

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return Math.max(map.size(), (nums.length / 2));

    }
}
