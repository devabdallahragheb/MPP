package homework.Lab5.pro4;

public class CustOrderFactory {
    public static Customer createCustomer() {
        return new Customer();
    }

    public static Order createOrder() {
        return new Order();
    }
}