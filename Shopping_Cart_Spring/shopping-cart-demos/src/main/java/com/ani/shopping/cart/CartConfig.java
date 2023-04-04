package com.ani.shopping.cart;

import org.springframework.context.annotation.Bean;

import com.ani.shopping.item.Item;
import com.ani.shopping.item.ItemController;

public class CartConfig {
    
    @Bean
    public User users(){
        return new User();
    }
    
    @Bean
    public Cart cart(){
        return new Cart();
    }

    @Bean
    public Item item(){
        return new Item();
    }

    @Bean
    public CartDataInput ip(){
        return new CartDataInput();
    }

    @Bean
    public CartController cartController(){
        return new CartController();
    }

    @Bean
    public ItemController itemController(){
        return new ItemController();
    }
}
