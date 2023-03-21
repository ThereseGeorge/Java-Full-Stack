package com.ani.file.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class RenameFile {
    public void Rename(){
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter path of file to be renamed");
        String file="";
        try {
            file = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Enter renamed path");
        String rename="";
        try {
            rename = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Source file: "+ file);
        System.out.println("Destination file: "+ rename);
        File oldfile=new File(file);
        File newfile=new File(rename);
        
       
        boolean flag= oldfile.renameTo(newfile);
        if(flag==true){
            System.out.println("file successfully renamed ");
        }
        else{
            System.out.println("File renaming failed");
        }
    }
    
}
