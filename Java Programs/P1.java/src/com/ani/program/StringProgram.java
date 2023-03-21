package com.ani.program;

public class StringProgram {
    String str;
   

    public void calculate(String str){
        this.str=str;
        String longSubString="";
        String currentSubString="";
        int n=str.length();
        

        int start=0;
        int end=0;
        while(end<n){
            char currentCh=str.charAt(end);
            if(currentSubString.indexOf(currentCh)==-1){
                currentSubString=currentSubString+currentCh;
                end++;
    
            if(currentSubString.length()>longSubString.length()){
                longSubString=currentSubString;


            }
            }
            else{
                int i=currentSubString.indexOf(currentCh);
                currentSubString=currentSubString.substring(i+1);
                start=start+(i+1);
            }
        }
        System.out.println("longest string="+longSubString);

    }
    


}
    
