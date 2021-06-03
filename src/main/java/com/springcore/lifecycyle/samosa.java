package com.springcore.lifecycyle;

public class samosa {
    int price;

    public samosa(int price) {
        System.out.println("Setting the price");
        this.price = price;
    }
    public void init(){
        System.out.println("Initializing samosa..........");
    }
    public void destroy(){
        System.out.println("Destroying samosa........");
    }

    public samosa() {
    }

    @Override
    public String toString() {
        return "samosa{" +
                "price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
