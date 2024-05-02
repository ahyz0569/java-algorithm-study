package org.example.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * 완전탐색 유형 문제 : 소수 찾기
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42839
 * */
public class Search003 {
    public int solution(String numbers) {
        char[] charArray = numbers.toCharArray();
        int[] numberArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            numberArray[i] = Character.getNumericValue(charArray[i]);
        }
        Arrays.sort(numberArray);

        HashSet<Integer> numberSet = new HashSet<>();

        do {
            String number = Arrays.stream(numberArray).mapToObj(String::valueOf).collect(Collectors.joining(""));
            numberSet.add(Integer.valueOf(number));
        } while (nextPermutation(numberArray));

        Arrays.stream(numberArray).boxed().distinct().filter(i -> i > 1).forEach(numberSet::add);

        // 소수판별 메서드를 통해 각 숫자별 소수 여부 판별하기
        int answer = 0;
        for (Integer i : numberSet) {
            if (isPrime(i)) answer++;
        }

        return answer;
    }

    public boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i*i <= number; i++) {
             if (number % i == 0)
                 return false;
        }

        return true;
    }

    public boolean nextPermutation(int[] numbers) {
        int size = numbers.length;
        int i = size - 1;

        while (i > 0 && numbers[i - 1] >= numbers[i])
            i--;

        if (i == 0) return false;

        int j = size - 1;
        while (numbers[i - 1] >= numbers[j])
            j--;

        swap(numbers, i - 1, j);

        int k = size - 1;
        while (i < k) {
            swap(numbers, i++, k--);
        }
        return true;
    }

    public void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
