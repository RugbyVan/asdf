package com.huawei.servicecomb;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class Projectdaf2Application {
    public static void main(String[] args) {
         SpringApplication.run(Projectdaf2Application.class,args);
    }
}
