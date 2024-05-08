package org.example.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search004Test {
    @Test
    @DisplayName("테스트 케이스 1")
    void test001(){
        // given
        int brown = 10;
        int yellow = 2;

        // when
        int[] solution = new Search004().solution(brown, yellow);

        // then
        Assertions.assertThat(solution).containsExactly(4, 3);
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test002(){
        // given
        int brown = 8;
        int yellow = 1;

        // when
        int[] solution = new Search004().solution(brown, yellow);

        // then
        Assertions.assertThat(solution).containsExactly(3, 3);
    }

    @Test
    @DisplayName("테스트 케이스 3")
    void test003(){
        // given
        int brown = 24;
        int yellow = 24;

        // when
        int[] solution = new Search004().solution(brown, yellow);

        // then
        Assertions.assertThat(solution).containsExactly(8, 6);
    }

    @Test
    @DisplayName("테스트 케이스 4")
    void test004(){
        // given
        int brown = 18;
        int yellow = 6;

        // when
        int[] solution = new Search004().solution(brown, yellow);

        // then
        Assertions.assertThat(solution).containsExactly(8, 3);
    }
}