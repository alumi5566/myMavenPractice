package org.guiceExample3;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.guiceExample3.models.CreditCardType;
import org.guiceExample3.models.Visa;
import org.guiceExample3.models.Debit;

public class PizzaBillingService implements BillingService {

    private final CreditCardType ccp;
    private final CreditCardType ccp2;

    private final String restaurantName;
    @Inject
    public PizzaBillingService(@Named("Pizza Restaurant") String restaurantName,
                                 @Visa CreditCardType ccp,
                                 @Debit CreditCardType ccp2) {
        this.restaurantName = restaurantName;
        this.ccp = ccp;
        this.ccp2 = ccp2;
    }

    public void chargeOrder(Integer orderCount, String creditCardNumber) {
        System.out.println("This is " + restaurantName);
        System.out.println("Order "+orderCount+" Pizza!! card number: " + creditCardNumber);
        System.out.println("Card is handled by " + ccp.getName());
        System.out.println("Card is also handled by " + ccp2.getName());
    }
}
