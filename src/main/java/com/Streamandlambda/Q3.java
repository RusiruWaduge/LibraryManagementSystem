package com.Streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[]args){
        List<String> nameList = Arrays.asList("rusiru","senumi","waduge");
        System.out.println(nameList);

        List<String> newList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newList);

        //back to lowercase
        System.out.println(nameList.stream().map(String::toLowerCase).collect(Collectors.toList()));
    }
}
