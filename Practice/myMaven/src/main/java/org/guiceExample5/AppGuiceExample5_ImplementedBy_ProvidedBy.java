package org.guiceExample5;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class AppGuiceExample5_ImplementedBy_ProvidedBy
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World App 5!" );
        Injector injector = Guice.createInjector(new BillingModule());
        PizzaBillingService pizza = injector.getInstance(PizzaBillingService.class);

        pizza.chargeOrder(100, "12345678");
    }
}

