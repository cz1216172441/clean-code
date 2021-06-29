package com.tw.academy.basic.$7_long_method;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public String getCustomerInformation() {
        return getCustomerName() + getCustomerAddress();
    }

    public String printOrderItems() {
        return getOrderItems().stream().map(OrderItem::print).collect(Collectors.joining("\n"));
    }

    public double calculateTotalSalesTax() {
        return getOrderItems().stream()
                .map(orderItem -> orderItem.getTotalAmount() * .10)
                .reduce(Double::sum)
                .orElse(0d);
    }
}
