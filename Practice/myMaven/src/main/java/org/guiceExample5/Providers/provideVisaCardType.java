package org.guiceExample5.Providers;

import com.google.inject.Provider;
import org.guiceExample5.Models.CreditCardType;
import org.guiceExample5.Models.VisaCardType;

public class provideVisaCardType implements Provider<CreditCardType> {
    public CreditCardType get() {
        return new VisaCardType();
    }
}
