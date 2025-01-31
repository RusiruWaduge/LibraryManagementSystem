package com.Streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q7 {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,345,12,567,765,1000);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
