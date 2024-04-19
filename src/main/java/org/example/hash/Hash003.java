package org.example.hash;

import java.util.*;

public class Hash003 {
    public boolean solution() {
//        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book = {"123", "12345", "1245", "1243", "12"};
//        Arrays.sort(phone_book, Comparator.comparingInt(String::length).reversed());
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            if (i == phone_book.length -1 ) return true;
            if (phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return true;
    }
}
