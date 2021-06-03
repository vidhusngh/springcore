package com.springcore.lifecycyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] arg) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        samosa sm = (samosa) context.getBean("item1");
        System.out.println(sm);
        context.registerShutdownHook();
        pepsi p1=(pepsi)context.getBean("pepsi");
        System.out.println(p1);
        roll rl=(roll)context.getBean("roll");
        System.out.println(rl);

    }

}