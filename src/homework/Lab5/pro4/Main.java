package homework.Lab5.pro4;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustOrderFactory.createCustomer();
        Order order1 = CustOrderFactory.createOrder();
        Order order2 = CustOrderFactory.createOrder();

        customer.addOrder(order1);
        customer.addOrder(order2);

        System.out.println("Customer has " + customer.getOrders().size() + " orders.");
    }
}