package com.Streamandlambda;

import java.util.Arrays;
import java.util.List;

public class Q8 {
    public static void main(String[]args){
        List<String> strList = Arrays.asList("Hello", "world","goodmorning");
        String joinedstr= String.join("-",strList);
        System.out.println(joinedstr);
    }
}
