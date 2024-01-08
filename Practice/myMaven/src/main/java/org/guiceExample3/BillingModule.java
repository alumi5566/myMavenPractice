package org.guiceExample3;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.guiceExample3.models.CreditCardType;
import org.guiceExample3.models.DebitCardType;
import org.guiceExample3.models.VisaCreditCardType;
import org.guiceExample3.models.Visa;
import org.guiceExample3.models.Debit;

public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardType.class).annotatedWith(Visa.class).to(VisaCreditCardType.class);
        bind(CreditCardType.class).annotatedWith(Debit.class).to(DebitCardType.class);
        // Constant Binding
        bind(String.class).annotatedWith(Names.named("Pizza Restaurant")).toInstance("My Best Pizze Place");
    }
}
