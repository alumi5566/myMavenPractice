package org.guiceExample4;

import com.google.inject.Inject;
import org.guiceExample4.models.CreditCardType;

import javax.inject.Named;

public class PizzaBillingService implements BillingService {

    private final CreditCardType ccp;
    private final CreditCardType ccp2;
    private final CreditCardType ccp3;

    @Inject
    public PizzaBillingService(@Named("Visa") CreditCardType ccp,
                               @Named("Debit") CreditCardType ccp2,
                               @Named("JBC") CreditCardType ccp3){
        this.ccp = ccp;
        this.ccp2 = ccp2;
        this.ccp3 = ccp3;
    }
    public void chargeOrder(Integer orderCount, String creditCardNumber) {
        System.out.println("Order "+orderCount+" Pizza!! card number: " + creditCardNumber);
        System.out.println("Card is handled by " + ccp.getName());
        System.out.println("Card is also handled by " + ccp2.getName());
        System.out.println("Card is also handled by " + ccp3.getName());
    }
}
