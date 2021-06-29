package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author Thoughtworks
 * @version 1.0
 * @since 2018-1-1
 */
public class OrderReceipt {
    private final Order o;

    public OrderReceipt(Order o) {
        this.o = o;
    }

    public String print() {
        StringBuilder output = new StringBuilder();

        // print headers
        output.append("======Printing Orders======\n");

        output.append(o.getCustomerInformation());
        output.append(o.printOrderItems());
        output.append('\n');

        // prints lineItems
        double totalOrderAmount = 0d;
        for (OrderItem orderItem : o.getOrderItems()) {
            // calculate sales tax @ rate of 10%
            double salesTax = orderItem.getTotalAmount() * .10;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            totalOrderAmount += orderItem.getTotalAmount() + salesTax;
        }

        // prints the state tax
        output.append("Sales Tax").append('\t').append(o.calculateTotalSalesTax());

        // print total amount
        output.append("Total Amount").append('\t').append(totalOrderAmount);
        return output.toString();
    }
}