package org.example.search;

import java.util.HashSet;

/**
 * 완전탐색 유형 문제 : 소수 찾기
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */
public class Search003 {
    static String[] numberArray;
    static boolean[] chkArray;
    static HashSet<Integer> numberSet;

    public int solution(String numbers) {
        numberSet = new HashSet<>();
        numberArray = numbers.split("");

        chkArray = new boolean[numberArray.length];

        permutation(0, "");

        // 소수판별 메서드를 통해 각 숫자별 소수 여부 판별하기
        long count = numberSet.stream().filter(this::isPrime).count();

        return Long.valueOf(count).intValue();
    }

    public void permutation(int idx, String sum) {
        if (!sum.isEmpty()) {
            numberSet.add(Integer.valueOf(sum));
        }
        for (int i = 0; i < numberArray.length; i++) {
            if (!chkArray[i]) {
                chkArray[i] = true;
                permutation(idx + 1, sum + numberArray[i]);
                chkArray[i] = false;
            }
        }
    }

    public boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
