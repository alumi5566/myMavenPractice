package org.guiceExample2;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.guiceExample2.models.CreditCardType;
import org.guiceExample2.models.DebitCardType;
import org.guiceExample2.models.VisaCardType;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardType.class).annotatedWith(Names.named("Visa")).to(VisaCardType.class);
        bind(CreditCardType.class).annotatedWith(Names.named("Debit")).to(DebitCardType.class);
//        bind(CreditCardType.class).to(VisaCardType.class);
    }
}
