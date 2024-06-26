package homework.prob2B;

public class OrderLine {
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    private Order order;

    public OrderLine(Order order) {
        this.order = order;
        order.addtoList(this);
    }
}
