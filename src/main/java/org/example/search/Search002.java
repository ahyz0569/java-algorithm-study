package org.example.search;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 완전탐색 유형 문제 : 모의고사
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * */
public class Search002 {
    public int[] solution(int[] answers) {
        int[][] cntOfAnswers = new int[][]{{1, 0}, {2, 0}, {3, 0}};

        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) cntOfAnswers[0][1] += 1;

            if (person2[i % person2.length] == answers[i]) cntOfAnswers[1][1] += 1;

            if (person3[i % person3.length] == answers[i]) cntOfAnswers[2][1] += 1;
        }

        Arrays.sort(cntOfAnswers, (o1, o2) -> o2[1] - o1[1]);

        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < cntOfAnswers.length; i++) {
            if (cntOfAnswers[i][1] == cntOfAnswers[0][1])
                answerList.add(cntOfAnswers[i][0]);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
