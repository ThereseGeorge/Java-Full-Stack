package com.ani.shopping.item;

import org.springframework.context.annotation.Bean;

public class ItemConfig {

    @Bean
    public Item items(){
        return new Item();
    }
    


}
