package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape choosenShape() {
        Random generator = new Random();
        Shape theShape;

        int choice = generator.nextInt(3);
        if(choice == 0) {
            theShape = new Triangle();
        }else if(choice == 1) {
            theShape = new Circle();
        }else {
            theShape = new Square();
        }
        return theShape;
    }

}
