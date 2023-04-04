package com.ani.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ani.shopping.item.ItemConfig;
import com.ani.shopping.item.ItemDb;

public final class App {



    public static void withSpringJavaConfig1() {
        System.out.println("🔥 Providing Dependencies With Java Code 🔥");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ItemConfig.class);

        String[] names = ctx.getBeanDefinitionNames();
        for(String nm : names) {
            System.out.println(" 👉 "+nm);
        }

        ItemDb itemDb = ctx.getBean(ItemDb.class);
        itemDb.checkFileValidity();
    }

    public static void withSpringJavaConfig2() {
        System.out.println("🔥 Providing Dependencies With Java Code 🔥");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CartConfig.class);

        String[] names = ctx.getBeanDefinitionNames();
        for(String nm : names) {
            System.out.println(" 👉 "+nm);
        }

        ItemDb itemDb = ctx.getBean(ItemDb.class);
        itemDb.checkFileValidity();
    }

    public static void main(String[] args) {
        withSpringJavaConfig();
    }
}
