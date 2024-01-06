package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// in previous step, we use ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
// here we use Singleton to ensure there is only one entity of ac
final public class ApplicationUtil {
    private static ApplicationContext ac = null;
    private ApplicationUtil(){}
    static {
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    public static ApplicationContext getApplicationContext(){
        return ac;
    }
}
