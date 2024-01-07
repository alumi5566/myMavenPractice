package org.guiceExample;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.guiceExample.models.CreditCardType;

public class PizzaBillingService implements BillingService {

    private final CreditCardType ccp;

    @Inject
    public PizzaBillingService(CreditCardType ccp) {
        this.ccp = ccp;
    }

    public void chargeOrder(Integer orderCount, String creditCardNumber) {
        System.out.println("Order "+orderCount+"Pizza!! card number: " + creditCardNumber);
        System.out.println("Card is handled by " + ccp.getName());
    }
}
