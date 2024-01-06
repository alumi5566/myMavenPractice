package org.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AppExample5_AnnotationQualifiers
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World App from Example5!" );
        // Asking factory to give us the object
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
