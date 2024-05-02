package org.example.search;

import java.util.Arrays;

/**
 * 완전탐색 유형 문제 : 최소직사각형
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * */
public class Search001 {
    public int solution(int[][] sizes) {
        int maxWidth = 0, maxHeight = 0;

        for (int[] ints : sizes) {
            Arrays.sort(ints);

            if (maxWidth < ints[0]) maxWidth = ints[0];
            if (maxHeight < ints[1]) maxHeight = ints[1];
        }

        return maxWidth * maxHeight;
    }
}
