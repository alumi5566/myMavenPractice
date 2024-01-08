package org.guiceExample4.models;

public class DebitCardType implements CreditCardType {

    String name;
    public DebitCardType() {
        this.name = "Debit Card";
    }

    public String getName() {
        return name;
    }
}
