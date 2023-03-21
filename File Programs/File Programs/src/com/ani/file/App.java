package com.ani.file;

import com.ani.file.programs.CopyFile;
import com.ani.file.programs.RenameFile;

public class App {
    public static void main(String[] args) throws Exception {
        FileProgram1 f1=new FileProgram1();
        Fileprogram2 f2=new Fileprogram2();
        //f1.calculate2();

        //f2.readFromUser();

        CopyFile cf=new CopyFile();
        //cf.copy();
        cf.demo();
        //RenameFile rf=new RenameFile();
        //rf.Rename();
    }
}
