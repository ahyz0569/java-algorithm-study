package org.example.hash;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Hash002Test {
    @Test
    @DisplayName("테스트 케이스 1")
    void test1(){
        // given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        // when
        String solution = new Hash002().solution(participant, completion);

        // then
        assertThat(solution).isEqualTo("leo");
    }

    @Test
    @DisplayName("테스트 케이스 2")
    void test2(){
        // given
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        // when
        String solution = new Hash002().solution(participant, completion);

        // then
        assertThat(solution).isEqualTo("vinko");
    }

    @Test
    @DisplayName("테스트 케이스 3")
    void test3(){
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        // when
        String solution = new Hash002().solution(participant, completion);

        // then
        assertThat(solution).isEqualTo("mislav");
    }
}