package org.example.streamApi;

import java.util.*;


public class StringArrayReverse {

    public static void main(String[] args) {
        List<String> str= Arrays.asList("Kane","Doe","Mike","Jack","Jane");
        str.forEach(System.out::println);
        System.out.println("--------------------");
        Collections.reverse(str);
        str.forEach(System.out::println);
    }


}
