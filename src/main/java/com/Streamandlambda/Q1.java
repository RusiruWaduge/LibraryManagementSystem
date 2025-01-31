package com.Streamandlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[]args){
        List<String> nameList = new ArrayList<>();
        nameList.add("Rusiru");
        nameList.add("Senumi");
        nameList.add("Waduge");
        System.out.println(nameList);


        List<String>nameList1 = Arrays.asList("yuyuy","rtrtr","iiii");
        System.out.println("before reverse"+nameList1);

        Collections.reverse(nameList1);
        System.out.println("after reverse" +nameList1);
    }
}
