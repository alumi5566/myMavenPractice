package org.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Autowired
    private Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
    public void drive(){
//        System.out.println("Riding a bike Example3; Tire: " + tire);
        System.out.println("Riding a bike Example3; Tire: " + tire.getBrand());
    }
}
