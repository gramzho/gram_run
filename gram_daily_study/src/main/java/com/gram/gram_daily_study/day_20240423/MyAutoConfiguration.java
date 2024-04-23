package com.gram.gram_daily_study.day_20240423;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zotij
 * @Date: 2024/4/23 21:56
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)
public class MyAutoConfiguration {
    static {
        System.out.println("MyAutoConfiguration init......");
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }
}
