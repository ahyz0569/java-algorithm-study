package org.example.sort;

import java.util.Arrays;

public class Sort001 {
    public int[] solution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] array_copy = Arrays.copyOf(array, array.length);

            if (commands[i][0] == commands[i][1]){
                answer[i] = array_copy[commands[i][0] - 1];
            } else {
                Arrays.sort(array_copy, commands[i][0] - 1, commands[i][1]);
                answer[i] = array_copy[commands[i][0] - 1 + commands[i][2] - 1];
            }
        }

        return answer;
    }
}
