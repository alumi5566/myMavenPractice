package org.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// when you add @component, auto generate a bean id = car (all lower case)
public class Car implements Vehicle {
    @Autowired
    // with Autowired, when we need this object, Spring will search the xml file for Bean
    private Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void drive(){
//        System.out.println("Driving a car Example3; Tire: " + tire);
        System.out.println("Driving a car Example3; Tire: " + tire.getBrand());
    }
}
