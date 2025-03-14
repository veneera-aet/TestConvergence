package org.example.streamApi;

import java.util.Arrays;
import java.util.List;

public class StringJoining {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Kane","Doe","Mike","Jack","Jane");
        System.out.println(String.join("-",str));
    }
}
