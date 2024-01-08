package org.guiceExample4;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import org.guiceExample4.models.DebitCardType;
import org.guiceExample4.models.VisaCardType;
import org.guiceExample4.models.*;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
//        bind(CreditCardType.class).annotatedWith(Names.named("Visa")).to(VisaCardType.class);
//        bind(CreditCardType.class).annotatedWith(Names.named("Debit")).to(DebitCardType.class);
    }

    @Provides
    @Named("Visa")
    public CreditCardType provideVisaCardType(){
        return new VisaCardType();
    }

    @Provides
    @Named("Debit")
    public CreditCardType provideDebitCardType(){
        return new DebitCardType();
    }

    @Provides
    @Named("JBC")
    public CreditCardType provideJBCCardType(){
        return new JBCCardType("JBC");
    }
}
