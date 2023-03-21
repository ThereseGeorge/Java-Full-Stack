package com.ani.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fileprogram2 {
    public void readFromUser(){
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        String input="";
        while(!input.equals("stop")){
            System.out.println("Enter the input");
            try {
                input=br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Entered input:  " +input);



        }

    }
    
}