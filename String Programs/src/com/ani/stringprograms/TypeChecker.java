package com.ani.stringprograms;

public class TypeChecker {

    private Object obj;

    public Object getType() {
        return obj;
    }

    public void setType(Object obj) {

   
        if (obj instanceof String) {
            System.out.println("The object is a String.");
        } else if (obj instanceof Integer) {
            System.out.println("The object is an Integer.");
        } else if (obj instanceof Double) {
            System.out.println("The object is a Double.");
        } else {
            System.out.println("The object is of an unknown type.");
        }

    }
    
}
