package com.springcore.lifecycyle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean, DisposableBean {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public pepsi() {
    }

    @Override
    public String toString() {
        return "pepsi{" +
                "price=" + price +
                '}';
    }

    public pepsi(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("taking pepsi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroying the bottle");
    }
}
