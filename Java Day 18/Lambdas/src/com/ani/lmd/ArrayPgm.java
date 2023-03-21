package com.ani.lmd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPgm {

    public void Operations(){
        Integer[] arr1={1,2,3,4,5};
        Integer[] arr2={4,5,6,7,8};
        Set<Integer> num1=new HashSet<Integer>();
        num1.addAll(Arrays.asList(arr1));
        Set<Integer> num2=new HashSet<Integer>();
        num2.addAll(Arrays.asList(arr2));
        Set<Integer> union=new HashSet<Integer>(num1);
        union.addAll(num2);
        System.out.println("Common Elements: " + union);
        Set<Integer> intersection=new HashSet<Integer>(num1);
        intersection.retainAll(num2);
        System.out.println("Unique Elements: " + intersection);
        

    }
    
}
