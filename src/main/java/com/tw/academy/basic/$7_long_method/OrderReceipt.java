package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author Thoughtworks
 * @version 1.0
 * @since 2018-1-1
 */
public class OrderReceipt {
    private final Order order;
    private final String orderReceiptHeader = "======Printing Orders======\n";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String print() {
        return orderReceiptHeader +
                order.getCustomerInformation() +
                order.printOrderItems() +
                '\n' +
                printOrderSalesTax() +
                printOrderTotalAmount();
    }

    private String printOrderSalesTax() {
        return String.format("Sales Tax\t%s", order.calculateTotalSalesTax());
    }

    private String printOrderTotalAmount() {
        return String.format("Total Amount\t%s", order.calculateTotalOrderAmount());
    }
}