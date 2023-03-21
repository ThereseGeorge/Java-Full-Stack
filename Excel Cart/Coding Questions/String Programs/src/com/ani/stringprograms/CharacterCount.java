package com.ani.stringprograms;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount{
    public void count(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        HashMap <Character, Integer> charCount = new HashMap<>();  
        for (int i = str.length() - 1; i >= 0; i--) {  
            if(charCount.containsKey(str.charAt(i))) {  
                int count = charCount.get(str.charAt(i));  
                charCount.put(str.charAt(i), ++count);  
            }   
            else{  
                charCount.put(str.charAt(i),1);  
            }  
        }  
        System.out.println(charCount);  
    }  
     
}
