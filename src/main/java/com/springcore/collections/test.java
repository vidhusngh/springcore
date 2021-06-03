package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] arg){
        ApplicationContext context=new ClassPathXmlApplicationContext("collectionsconfig.xml");
        emp employer=(emp)context.getBean("emp");
        System.out.println(employer.getName());
        System.out.println(employer.getAddresses());
        System.out.println(employer.getPhones());
        System.out.println(employer.getCourses());

    }
}
