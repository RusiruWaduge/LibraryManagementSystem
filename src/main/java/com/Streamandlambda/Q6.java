package com.Streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6 {
    public static void main(String[]args){
        List<Integer>list = Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer>sqrList = list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(sqrList);
    }
}
