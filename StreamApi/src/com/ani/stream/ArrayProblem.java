package com.ani.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayProblem {
    private static final int Integer = 0;
    private static final int Stream = 0;

    public boolean demo1(){

        Integer[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> array = new ArrayList<>(Arrays.asList(arr));

        Stream<Integer> stream1 = array.stream();
        boolean stream2;
        Stream<Integer> stream2 =  (java.util.stream.Stream<java.lang.Integer>) stream1.distinct().collect(Collectors.toList());
     

        System.out.println(stream1);
        System.out.println(stream1);


    }
    
}
