package org.example2;

import org.springframework.stereotype.Component;

@Component
// when you add @component, auto generate a bean id = car (all lower case)
public class Car implements Vehicle {
    public void drive(){
        System.out.println("Driving a car Example2");
    }
}
