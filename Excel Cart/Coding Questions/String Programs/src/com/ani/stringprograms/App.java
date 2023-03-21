package com.ani.stringprograms;

public class App {
    public static void main(String[] args) throws Exception {
        
        RemChar rc = new RemChar();

        rc.remChar("abcxpqr", "x");
        rc.remChar("abcpqr", "x");
        rc.remChar("", "x");
        rc.remChar("abcxpqr", "");
        rc.remChar("axb", "x");
        rc.remChar("x", "x");
        rc.remChar("xx", "x");
        rc.remChar("axbcxpqr", "x");
        
        //TypeChecker tp=new TypeChecker();
        //tp.setType("hello");


        CharacterCount cc=new CharacterCount();
        cc.count();



        
        //System.out.println("Answer (abcpqr)"+ rc.remChar("abcxpqr", "x"));
        //System.out.println("There is no x in string"+ rc.remChar("abcpqr", "x"));
        //System.out.println("Invalid Strinf"+ rc.remChar("", "x"));
        //System.out.println("Specify the character to be removed"+ rc.remChar("abcxpqr", ""));
        //System.out.println("Answer (ab) "+ rc.remChar("axb", "ab"));
        //System.out.println("Answer (nothing remains) "+ rc.remChar("x", "x"));
        //System.out.println("Answer (x) "+ rc.remChar("xx", "x"));
        //System.out.println("Answer (abcpqr)"+ rc.remChar("axbcxpqr", "x"));

       

    }
    
}

