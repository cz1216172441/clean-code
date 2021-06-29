package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {
    String customerName;
    String address;
    List<OrderItem> orderItems;

    public Order(String customerName, String address, List<OrderItem> orderItems) {
        this.customerName = customerName;
        this.address = address;
        this.orderItems = orderItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<OrderItem> getLineItems() {
        return orderItems;
    }
}
