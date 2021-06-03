package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testper {
    public static void main(String [] arg){
        ApplicationContext per=new ClassPathXmlApplicationContext("constructorinjectionconfig.xml");
        Person p=(Person) per.getBean("person");
        System.out.print(p);
    }
}
