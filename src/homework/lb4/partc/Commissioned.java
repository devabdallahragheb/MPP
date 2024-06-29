package homework.lb4.partc;

import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    // Constructor
    public Commissioned(String empId, double baseSalary, double commission, List<Order> orders) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalOrderAmount = 0;
        for (Order order : orders) {
            if (order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        return baseSalary + (commission * totalOrderAmount);
    }
}