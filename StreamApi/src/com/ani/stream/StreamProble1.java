package com.ani.stream;

import java.util.Arrays;

public class StreamProble1 {

    public void calculate(){
    int[][] arr1={{1,2,2},{4,4,6}};
    int sum=Arrays.stream(arr1).mapToInt(arr->arr[0]).sum();
    System.out.println(sum);
    }
    
}
