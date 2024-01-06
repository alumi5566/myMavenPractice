package org.example5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Instead of xml file. we are fetching object from here
@Configuration
@ComponentScan(basePackages = "org.example5") // Means all components are pre-defined
public class AppConfig {

//    @Bean
//    // Declare this is a Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//
//    @Bean
//    // notice the getter function doesn't matter. the bean id is auto generated based on class name
//    public MobileCPU getCPU(){
//        return new Intel();
//    }
    // Removing above, we will get Bean-not-found error
    // Adding @Component to Samsung and Intel
}
