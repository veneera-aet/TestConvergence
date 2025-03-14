package org.example.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSquare {
    public static void main(String[] args) {
        List<Integer> i= Arrays.asList(1,3,5,2,5,8);
        List<Integer> sqrs = i.stream().map(integer -> (int) Math.pow(integer, 2)).collect(Collectors.toList());
        sqrs.forEach(System.out::println);
    }
}
