package org.example.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,10,4,6,3,8,11);
        List<Integer> evenNumbers = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
    }
}
