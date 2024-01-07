package org.guiceExample.models;

public class VisaCreditCardType implements CreditCardType{

    String name;
    public VisaCreditCardType() {
        this.name = "Visa";
    }

    public String getName() {
        return name;
    }
}
