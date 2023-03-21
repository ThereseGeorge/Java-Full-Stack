package com.ani.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileProgram1 {
    
    public void calculate1(){
        File file = new File("Fileprograms");
        
        if(file.exists()){
            double bytes=file.length();
            double kilobytes=(bytes/1024);
            double megabytes=(kilobytes/1024);
            System.out.println("file size in bytes "+ bytes);
            System.out.println("file size in kilobytes "+ kilobytes);
            System.out.println("file size in Megabytes "+ megabytes);

        }
        else{
            System.out.println("file does not exists");
        }
        
    }




    
    public void calculate2(){
        File file= new File("Fileprograms/test2");
        if(file.exists()){
            
            Writer writer = null;
            try {
                writer = new FileWriter(file);
                writer.write("This is first hello word 😀😀😀");
               
            } catch (IOException e) {
                System.out.println("❌ Problem in creating/writing file");
            }finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("❌ Problem in closing file");
                }
            }
        
    
        }
        else{
          
            System.out.println("file does not exists");

        }
        
    }
    public void calculate3(){
        File file= new File("Fileprograms/test1");
        if(file.exists()){
            System.out.println("file exists");
        }
        else{
            System.out.println("file not exists");
        }
            
    }
    public void calculate4(){
        File file= new File("Fileprograms/test1");
        
            
    }

    
}
