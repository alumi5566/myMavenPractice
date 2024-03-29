package org.example;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppExample1_ApplicationContext
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World Example1!" );
//        Without DI, need to change every time
//        Car car = new Car();
//        car.drive();
//        Bike bike = new Bike();
//        bike.drive();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        new ClassPathXmlApplicationContext("spring.xml"); doesn't work
//        ApplicationContext context = new FileSystemXmlApplicationContext("Practice/myMaven/src/main/java/spring.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring.xml");
//        getBean() will give you the obj based on the bean ID
        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();
    }
}
