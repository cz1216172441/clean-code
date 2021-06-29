package com.tw.academy.basic.$7_long_method;

import java.util.List;
import java.util.stream.Collectors;

public class Order {

    private final double taxRate = 0.1;

    private final String customerName;
    private final String receiverAddress;
    private final List<OrderItem> orderItems;

    public Order(String customerName, String receiverAddress, List<OrderItem> orderItems) {
        this.customerName = customerName;
        this.receiverAddress = receiverAddress;
        this.orderItems = orderItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return receiverAddress;
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
                .map(orderItem -> orderItem.getTotalAmount() * taxRate)
                .reduce(Double::sum)
                .orElse(0d);
    }

    public double calculateTotalOrderAmount() {
        double totalAmount = getOrderItems().stream()
                .map(OrderItem::getTotalAmount)
                .reduce(Double::sum)
                .orElse(0d);
        return totalAmount + calculateTotalSalesTax();
    }
}
