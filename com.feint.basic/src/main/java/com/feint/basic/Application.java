package com.feint.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by feint on 16/9/5.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args){

          SpringApplication.run(Application.class,args);

//        System.out.println("Let's inspect the beans provided by Spring Boot: ");

//        String[] beanNames =context.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//
//        for(String beanName: beanNames){
//            System.out.println(beanName);
//        }
    }
}
