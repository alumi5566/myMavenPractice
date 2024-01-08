package org.guiceExample5;

import com.google.inject.Inject;
import org.guiceExample5.Models.CreditCardType;
import org.guiceExample5.Models.StorageType;

import javax.inject.Named;

public class PizzaBillingService implements BillingService {

    private final CreditCardType ccp;
    private final StorageType sp;

    @Inject
    public PizzaBillingService(CreditCardType ccp,
                               StorageType sp){
        this.ccp = ccp;
        this.sp = sp;
    }
    public void chargeOrder(Integer orderCount, String creditCardNumber) {
        System.out.println("Order "+orderCount+" Pizza!! card number: " + creditCardNumber);
        System.out.println("Card is handled by " + ccp.getName());

        System.out.println("Checking storeage: " + sp.getName());
    }
}
