package org.example.hash;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Hash001Test {
    @Test
    @DisplayName("테스트 케이스 1")
    void test1(){
        // given
        int[] nums = {3,1,2,3};

        // when
        int solution = new Hash001().solution(nums);

        // then
        assertThat(solution).isEqualTo(2);
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test2(){
        // given
        int[] nums = {3,3,3,2,2,4};

        // when
        int solution = new Hash001().solution(nums);

        // then
        assertThat(solution).isEqualTo(3);
    }

    @Test
    @DisplayName("테스트 케이스 3")
    void test3(){
        // given
        int[] nums = {3,3,3,2,2,2};

        // when
        int solution = new Hash001().solution(nums);

        // then
        assertThat(solution).isEqualTo(2);
    }

}