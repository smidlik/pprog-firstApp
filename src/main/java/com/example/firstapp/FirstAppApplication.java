package com.example.firstapp;

import com.example.firstapp.web.Controler1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {

    public static void main(String[] args) {
        Controler1 c = new Controler1();
        SpringApplication.run(FirstAppApplication.class, args);
    }

}
