package org.example.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerMax {
    public static void main(String[] args) {
        List<Integer> i= Arrays.asList(1,38,36,45,47,16,48);
        Optional<Integer> max = i.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
