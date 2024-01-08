package org.guiceExample3.models;

//@Target({ FIELD, PARAMETER, METHOD })
//@Retention(RUNTIME)
//@BindingAnnotation

public class VisaCreditCardType implements CreditCardType {

    String name;
    public VisaCreditCardType() {
        this.name = "Visa";
    }

    public String getName() {
        return name;
    }
}
