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

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String print() {
        StringBuilder output = new StringBuilder();
        output.append("======Printing Orders======\n");
        output.append(order.getCustomerInformation());
        output.append(order.printOrderItems());
        output.append('\n');
        output.append(printOrderSalesTax());
        output.append(printOrderTotalAmount());
        return output.toString();
    }

    private String printOrderSalesTax() {
        return String.format("Sales Tax\t%s", order.calculateTotalSalesTax());
    }

    private String printOrderTotalAmount() {
        return String.format("Total Amount\t%s", order.calculateTotalOrderAmount());
    }
}