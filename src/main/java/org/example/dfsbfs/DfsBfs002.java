package org.example.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 깊이/너비 우선 탐색 유형 문제 : 네트워크
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43162
 * */
public class DfsBfs002 {
    static boolean[] ch;
    static int N;
    static int count;

    public void bfs(int v, int[][] computers) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(v);
        ch[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();

            for (int i = 0; i < N; i++) {
                if (computers[v][i] == 1 && !ch[i]) {
                    queue.add(i);
                    ch[i] = true;
                }
            }
        }
        count += 1;
    }

    public int solution(int n, int[][] computers) {
        ch = new boolean[computers.length];
        N = n;

        count = 0;

        for (int i = 0; i < N; i++) {
            if (!ch[i]) {
                bfs(i, computers);
            }
        }

        return count;
    }
}
