package org.example.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Search001Test {
    @Test
    @DisplayName("테스트 케이스 1")
    void test001(){
        // given
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        // when
        int solution = new Search001().solution(sizes);

        // then
        assertThat(solution).isEqualTo(4000);
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test002(){
        // given
        int[][] sizes = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        // when
        int solution = new Search001().solution(sizes);

        // then
        assertThat(solution).isEqualTo(120);
    }

    @Test
    @DisplayName("테스트 케이스 3")
    void test003(){
        // given
        int[][] sizes = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        // when
        int solution = new Search001().solution(sizes);

        // then
        assertThat(solution).isEqualTo(133);
    }
}