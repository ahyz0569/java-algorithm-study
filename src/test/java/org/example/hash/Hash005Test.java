package org.example.hash;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Hash005Test {
    @Test
    @DisplayName("테스트 케이스 1 통과")
    void test001(){
        // given
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        // when
        int[] solution = new Hash005().solution(genres, plays);

        // then
        assertThat(solution).containsExactly(new int[]{4, 1, 3, 0});
    }

    @Test
    @DisplayName("테스트 케이스 2 통과")
    void test002(){
        // given
        String[] genres = {"A", "A", "B", "A", "B", "B"};
        int[] plays = {5, 5, 6, 5, 7, 7};

        // when
        int[] solution = new Hash005().solution(genres, plays);

        // then
        assertThat(solution).containsExactly(new int[]{4, 5, 0, 1});
    }

    @Test
    @DisplayName("테스트 케이스 3 통과")
    void test003(){
        // given
        String[] genres = {"A", "A", "B"};
        int[] plays = {600, 500, 300};

        // when
        int[] solution = new Hash005().solution(genres, plays);

        // then
        assertThat(solution).containsExactly(new int[]{0, 1, 2});
    }
}