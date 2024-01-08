package org.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppExample2_AnnotationBase_SetterInject_ConstructInject
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World App from Example2!" );
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring2.xml");
//        getBean() will give you the obj based on the bean ID
//        different from example one, we have @components for all vehicle class
        Vehicle obj = (Vehicle) context.getBean("car");
        obj.drive();
        Vehicle obj2 = (Vehicle) context.getBean("bike");
        obj2.drive();

//        testing Setter injection and Constructor Injection
        Tire t = (Tire) context.getBean("tire");
        System.out.println(t.getBrand());
    }
}
