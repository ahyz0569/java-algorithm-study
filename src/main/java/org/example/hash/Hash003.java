package org.example.hash;

import java.util.*;

/**
 * 문제: 전화번호 목록
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42577
 * */
public class Hash003 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            if (i == phone_book.length -1 )
                return true;

            if (phone_book[i+1].startsWith(phone_book[i]))
                return false;
        }

        return true;
    }
}
