package org.example.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperNames {
    public static void main(String[] args) {

        List<String> str= Arrays.asList("Kane","Doe","Mike","Jack","Jane");
        List<String> upperNames = str.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperNames.forEach(System.out::println);
    }
}
