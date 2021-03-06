package com.tw.academy.basic.$7_long_method;

public class OrderItem {
    private final String description;
    private final double price;
    private final int quantity;

    public OrderItem(String description, double p, int quantity) {
        super();
        this.description = description;
        this.price = p;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return price * quantity;
    }

    public String print() {
        return String.format("%s\t%s\t%d\t%s", getDescription(), getPrice(), getQuantity(), getTotalAmount());
    }
}