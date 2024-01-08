package org.guiceExample5.Models;

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
