package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] { "applicationContext.xml" });
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Category c = (Category) context.getBean("c");
        Product p = (Product) context.getBean("p");

        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());
//        System.out.println(c.getName());
    }
}
