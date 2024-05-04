package org.example.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 완전탐색 유형 문제 : 카펫
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42842#
 */
public class Search004 {
    public int[] solution(int brown, int yellow){
        // 1. brown + yellow 의 약수 탐색 (제곱근에 가까운 수 부터)
        // 2. yellow의 약수 탐색 (제곱근에 가까운 수 부터)
        // 3. 2의 조건에 부합하는 약수 중 큰 수에 2를 더한 수가 1의 조건에 부합하는 약수와 같을 경우 1에서 탐색한 약수 리스트를 리턴
        int square = brown + yellow;

        ArrayList<Integer> divisorList = new ArrayList<>();
        int sqrt = (int) Math.sqrt(square);
        for (int i = sqrt; i >= 1; i--) {
            if (square % i == 0) {
                if ( (square / i != i || sqrt == i) && checkAvailableSquare(square / i, findDivisor(yellow)))
                    divisorList.addAll(List.of(i, square/i));
            }
        }
        return divisorList.stream()
                          .sorted(Comparator.reverseOrder())
                          .mapToInt(Integer::intValue)
                          .toArray();
    }

    public boolean checkAvailableSquare(int divisor, int yellow){
        return (yellow + 2) == divisor;
    }

    public int findDivisor(int integer) {
        int sqrt = (int) Math.sqrt(integer);
        for (int i = sqrt; i >= 1; i--) {
            if (integer % i == 0) {
                if (integer / i != i ) return (integer / i);
            }
        }

        return 1;
    }
}
