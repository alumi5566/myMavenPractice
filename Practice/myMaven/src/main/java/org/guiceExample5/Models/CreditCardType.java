package org.guiceExample5.Models;

import com.google.inject.ProvidedBy;
import org.guiceExample5.Providers.provideVisaCardType;

@ProvidedBy(provideVisaCardType.class)
public interface CreditCardType {
    String name = "";
    String getName();
}
