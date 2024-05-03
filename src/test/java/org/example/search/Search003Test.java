package org.example.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Search003Test {

    @Test
    @DisplayName("테스트 케이스 1")
    void test001(){
        // given
        String number = "17";

        // when
        int solution = new Search003().solution(number);

        // then
        assertThat(solution).isEqualTo(3);
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test002(){
        // given
        String number = "011";

        // when
        int solution = new Search003().solution(number);

        // then
        assertThat(solution).isEqualTo(2);
    }

    @Test
    @DisplayName("테스트 케이스 3")
    void test003(){
        // given
        String number = "1231";

        // when
        int solution = new Search003().solution(number);

        // then
        assertThat(solution).isEqualTo(18);
    }

}