package org.example.search;

/**
 * 완전탐색 유형 문제 : 카펫
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42842#
 */
public class Search004 {
    public int[] solution(int brown, int yellow){
        // 가로가 x, 세로가 y라고 할 때, (x >= y)
        // x + y = brown / 2 + 2
        // x * y = brown + yellow
        int circum = brown / 2 + 2;
        int area = brown + yellow;

        int y = circum / 2;
        int x = circum - y;

        while (x * y != area) {
            if (x * y < area) {
                x -= 1;
                y += 1;
            } else {
                x += 1;
                y -= 1;
            }
        }

        return new int[]{x, y};
    }

}
