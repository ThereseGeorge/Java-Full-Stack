package com.ani.program;

public class RotationEquality {
    
    String str1,str2;
    String revStr="";

    public boolean isRotationEqual(String str1, String str2) {
        
        int n=str1.length();
        for(int i=(n-1);i>=0;i--){
            revStr=revStr+str1.charAt(i);
            System.out.println("Reverse string="+revStr);
        }
       
            
        if(str2.equals(revStr)){
            return true;
        }
        else{
            return false;
        }

        
    }

}
