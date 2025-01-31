package com.Streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[]args){
        List<String> nameList = Arrays.asList("qwe","kjh","mnb","dfg","asd");
        List<String> namesStartsWithK = nameList.stream().filter(x-> x.startsWith("k")).collect(Collectors.toList());
        System.out.println(namesStartsWithK);
    }
}
