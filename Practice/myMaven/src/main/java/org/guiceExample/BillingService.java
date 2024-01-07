package org.guiceExample;

public interface BillingService {
    void chargeOrder(Integer orderCount, String creditCardNumber);
}
