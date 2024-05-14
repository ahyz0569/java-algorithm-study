package org.example.dfsbfs;

/**
 * 깊이/너비 우선 탐색 유형 문제 : 타겟 넘버
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43165
 * */
public class DfsBfs001 {
    static boolean[] sign;
    static int[] numbersArray;
    static int N;
    static int targetNumber;
    static int count;

    public void dfs(int l) {
        if (l == N) {
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (sign[i]) {
                    result += numbersArray[i];
                } else {
                    result -= numbersArray[i];
                }
            }

            if (result == targetNumber) {
                count += 1;
            }

        } else {
            sign[l] = true;
            dfs(l + 1);
            sign[l] = false;
            dfs(l + 1);
        }
    }
    public int solution(int[] numbers, int target) {
        sign = new boolean[numbers.length];
        N = numbers.length;

        numbersArray = numbers;
        targetNumber = target;

        count = 0;

        dfs(0);

        return count;
    }
}
