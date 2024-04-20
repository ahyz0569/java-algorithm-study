package org.example.hash;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Hash003Test {
    @Test
    @DisplayName("테스트 케이스 1")
    void test1(){
        // given
        String[] phone_book = {"119", "97674223", "1195524421"};

        // when
        boolean solution = new Hash003().solution(phone_book);

        // then
        assertThat(solution).isFalse();
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test2(){
        // given
        String[] phone_book = {"123","456","789"};

        // when
        boolean solution = new Hash003().solution(phone_book);

        // then
        assertThat(solution).isTrue();
    }

    @Test
    @DisplayName("테스트 케이스 3")
    void test3(){
        // given
        String[] phone_book = {"12","123","1235","567","88"};

        // when
        boolean solution = new Hash003().solution(phone_book);

        // then
        assertThat(solution).isFalse();
    }

    @Test
    @DisplayName("테스트 케이스 4")
    void test4(){
        // given
        String[] phone_book = {"123", "12345", "1245", "1243", "12"};

        // when
        boolean solution = new Hash003().solution(phone_book);

        // then
        assertThat(solution).isFalse();
    }
}