package com.ani.sdw;

import com.ani.sdw.date.DateDemo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        StringDemos sd=new StringDemos();
        sd.demo1();
        sd.demo2();
        sd.demo3();
        sd.demo4();
        sd.demo5(); 

        DateDemo dd= new DateDemo();
        dd.demo1();
        dd.demo2();

    }
}

