package org.guiceExample4.models;

public class JBCCardType implements CreditCardType {

    String name;
    public JBCCardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
