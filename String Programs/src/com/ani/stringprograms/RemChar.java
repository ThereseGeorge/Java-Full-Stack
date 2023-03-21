package com.ani.stringprograms;

public class RemChar {
String stringOne,stringTwo;

    public void remChar(String stringOne,String stringTwo){
        this.stringOne=stringOne;
        this.stringTwo=stringTwo;
        

        if(stringOne==""){
            System.out.println("String 1 " +stringOne+ "is invalid");

        }
        else if(stringTwo==""){
            System.out.println("Specify the character to be removed");

        }
        else if(stringOne.equals(stringTwo)){
            System.out.println("Nothing remains");

        }
        

        else if(stringOne.contains(stringTwo)==true){
            
            int n=stringOne.length()-1;
            for(int i=0;i<n;i++){
                
                if(stringOne.charAt(i)==stringTwo.charAt(0)){
    
                    String str1=stringOne.substring(0, i);
                    String str2=stringOne.substring(i+1,n+1);
                    String str=str1.concat(str2);
                    System.out.println(str); 
                    
            
                }
              
            }
            
          
        }
        else{

            System.out.println("There is no string  " +stringTwo+ "  in string "+ stringOne);

        }
            
           

    }

   
}
    
    

//System.out.println("There is no string  " +stringTwo+ "  in string "+ stringOne);
//else if(stringOne.contains(stringTwo)==false){
//   System.out.println("There is no string  " +stringTwo+ "  in string "+ stringOne);
