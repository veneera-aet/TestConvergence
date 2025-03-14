package org.example.streamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithLetter {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Jane","Emali","Jack","Kane");
        List<String> startWithJLtters = str.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        startWithJLtters.forEach(System.out::println);
    }
}
