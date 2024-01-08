package org.guiceExample4.models;

//@Target({ FIELD, PARAMETER, METHOD })
//@Retention(RUNTIME)
//@BindingAnnotation

public class VisaCardType implements CreditCardType {

    String name;
    public VisaCardType() {
        this.name = "Visa";
    }

    public String getName() {
        return name;
    }
}
