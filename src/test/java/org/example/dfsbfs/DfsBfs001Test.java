package org.example.dfsbfs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DfsBfs001Test {
    @Test
    @DisplayName("테스트 케이스 1")
    void test001(){
        // given
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        // when
        int solution = new DfsBfs001().solution(numbers, target);

        // then
        Assertions.assertThat(solution).isEqualTo(5);
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test002(){
        // given
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        // when
        int solution = new DfsBfs001().solution(numbers, target);

        // then
        Assertions.assertThat(solution).isEqualTo(2);
    }

}