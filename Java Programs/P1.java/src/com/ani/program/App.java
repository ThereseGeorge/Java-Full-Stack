package com.ani.program;
import java.util.Scanner;

import javax.swing.border.AbstractBorder;
import com.ani.program.RotationEqaulity;

public class App {
    public static void main(String[] args) throws Exception {

    

        RotationEqaulity roEq = new RotationEqaulity();

        String sts1 = roEq.isRotationEqual("abc", "bbc") ? "bbc is rotation of abc" : "bbc is not a roatation of abc";
        System.out.println(sts1);

        String sts2 = roEq.isRotationEqual("aa", "aa") ? "aa is rotation of aa" : "aa is not a roatation of aa";
        System.out.println(sts2);

        String sts3 = roEq.isRotationEqual("a", "b") ? "b is rotation of a" : "b is not a roatation of a";
        System.out.println(sts3);

        String sts4 = roEq.isRotationEqual("a", "a") ? "a is rotation of a" : "a is not a roatation of a";
        System.out.println(sts4);

        String sts5 = roEq.isRotationEqual("abcpqr", "rqpcba") ? "rqpcba is rotation of abcpqr" : "rqpcba is not a roatation of abcpqr";
        System.out.println(sts5);
    }
}
