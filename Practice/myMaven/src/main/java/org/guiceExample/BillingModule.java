package org.guiceExample;

import com.google.inject.AbstractModule;
import org.guiceExample.models.CreditCardType;
import org.guiceExample.models.VisaCreditCardType;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardType.class).to(VisaCreditCardType.class);
    }
}
