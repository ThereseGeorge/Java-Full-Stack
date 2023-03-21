package com.ani.file.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;


public class CopyFile {
    
    private static final String Fileprograms = null;

    public void copy(){
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter source file");
        String src="";
        try {
            src = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Enter destination file");
        String dst="";
        try {
            dst = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Source file: "+ src);
        System.out.println("Destination file: "+ dst);
        File source=new File(src);
        File destination= new File(dst);
        try {
            Files.copy(source.toPath(),destination.toPath());
            System.out.println("Files successfully copied");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Copying of files failed");
            e.printStackTrace();
        }
        
        public void demo(){
            File file = new File("Fileprograms");
            System.out.println(file.getAbsolutePath());

        if(file.isDirectory()) {
            System.out.println("📂 This is a Directory");

            File sub = new File(Fileprograms, "test1");
            boolean stsSub = sub.exists();
            System.out.println(!stsSub ? "✅ Successfuly Created" : "❌ Directory Already Exists");
            if(!stsSub)
                sub.mkdir();

    
            File subFile = new File(sub, "abc.txt");
            boolean sts = false;
            try {
                sts = subFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(sts ? "✅ Successfuly Created" : "❌ File Already Exists");
        }
        


    }
}
