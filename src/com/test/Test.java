package com.test;

// 1. traditional approach: import and use
//import com.service.UserService;

// 2. Bean
// The idea of injection
// Notice that we didn't write any line of setName("XXX");
// The variable in bean injection the value into UserService
import com.util.ApplicationUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.UserService;
import com.service.ByeService;

public class Test {
    // entry point, wanna use service to output the string
    public static void main(String[] args) {
        // 1. traditional approach: import and use
//        UserService userService = new UserService();
//        userService.setName("Alumi");
//        userService.sayHello();
        // 2. Spring (assume your applicationContext.xml is finished)
//        (a) get container objective (the applicationContext objective) of Spring
//        (b) there is an interface in Spring API:
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");   // file name can change, all the Bean in XML will be created
//        UserService us = (UserService) ac.getBean("hsp");   // can be found in BeanFactory
//        us.sayHello();

        // 2.5 When add ByeService, we can get the value from ac directly
//        ByeService byeService = (ByeService) ac.getBean("hsp2");
//        byeService.sayBye();

        // 3. use Singleton
        // beautiful
        ((UserService) ApplicationUtil.getApplicationContext()
                .getBean("hsp"))
                .sayHello();
    }
}
