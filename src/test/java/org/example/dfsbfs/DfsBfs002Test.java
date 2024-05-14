package org.example.dfsbfs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class DfsBfs002Test {

    @Test
    @DisplayName("테스트 케이스 1")
    void test001(){
        // given
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        // when
        int solution = new DfsBfs002().solution(n, computers);

        // then
        assertThat(solution).isEqualTo(2);
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test002(){
        // given
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        // when
        int solution = new DfsBfs002().solution(n, computers);

        // then
        assertThat(solution).isEqualTo(1);
    }
}