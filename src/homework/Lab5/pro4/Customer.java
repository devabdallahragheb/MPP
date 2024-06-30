package homework.Lab5.pro4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Order> orders;

    Customer() {
        orders = new ArrayList<>();
    }

    void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
