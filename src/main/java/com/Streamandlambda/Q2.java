package com.Streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[]args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> eventList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> eventList1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(eventList);
    }
}
