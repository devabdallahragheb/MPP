package homework.lb4.partc;

import java.time.LocalDate;

public class Order {
    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    // Constructor
    public Order(int orderNo, LocalDate orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    // Getters
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}