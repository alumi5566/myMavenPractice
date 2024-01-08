package org.guiceExample2;

import com.google.inject.Inject;
import org.guiceExample2.models.CreditCardType;

import javax.inject.Named;

public class PizzaBillingService implements BillingService {

    private final CreditCardType ccp;
    private final CreditCardType ccp2;

    @Inject
//    public PizzaBillingService(@Named("Visa") CreditCardType ccp) {
//        this.ccp = ccp;
//    }
    public PizzaBillingService(@Named("Visa") CreditCardType ccp,
                                @Named("Debit") CreditCardType ccp2) {
        this.ccp = ccp;
        this.ccp2 = ccp2;
    }

    public void chargeOrder(Integer orderCount, String creditCardNumber) {
        System.out.println("Order "+orderCount+" Pizza!! card number: " + creditCardNumber);
        System.out.println("Card is handled by " + ccp.getName());
        System.out.println("Card is also handled by " + ccp2.getName());
    }
}
