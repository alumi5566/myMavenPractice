package org.guiceExample;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class AppGuiceExample_Binding
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World App!" );
        Injector injector = Guice.createInjector(new BillingModule());
        PizzaBillingService pizza = injector.getInstance(PizzaBillingService.class);

        pizza.chargeOrder(100, "12345678");
        // dummy commit
    }
}

