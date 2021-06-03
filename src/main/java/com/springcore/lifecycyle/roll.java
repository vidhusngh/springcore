package com.springcore.lifecycyle;

public class roll {
    private int price;

    public roll() {
    }
    public void start(){
        System.out.print("making roll");
    }
    public void end(){
        System.out.print("destroying roll");
    }

    @Override
    public String toString() {
        return "roll{" +
                "price=" + price +
                '}';
    }

    public roll(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
