package org.example.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Search002Test {

    @Test
    @DisplayName("테스트 케이스 1")
    void test001(){
        // given
        int[] answers = {1, 2, 3, 4, 5};

        // when
        int[] solution = new Search002().solution(answers);

        // then
        assertThat(solution).containsExactly(1);
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test002(){
        // given
        int[] answers = {1, 3, 2, 4, 2};

        // when
        int[] solution = new Search002().solution(answers);

        // then
        assertThat(solution).containsExactly(1, 2, 3);
    }
}