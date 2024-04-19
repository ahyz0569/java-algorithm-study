package org.example.sort;

import java.util.Arrays;

public class Sort002 {
    public String solution() {
//        int[] numbers = {3, 30, 34, 5, 9};
        int[] numbers = {232, 23};
//        int[] numbers = {101, 10};
//        int[] numbers = {233, 23};

        if (Arrays.stream(numbers).allMatch(n -> n == 0)) return "0";

        String[] strings = Arrays.stream(numbers).boxed().map(String::valueOf).sorted().toArray(String[]::new);

        Arrays.sort(strings, (o1, o2) -> {
            String o1o2 = o1.concat(o2);
            String o2o1 = o2.concat(o1);

            return o2o1.compareTo(o1o2);
        });

        Arrays.stream(strings).forEach(System.out::println);

        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }

        return builder.toString();
    }
}
