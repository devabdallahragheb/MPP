package homework.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private  String type;

    public Order( ) {
      list = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<OrderLine> getList() {
        return list;
    }

    public void setList(List<OrderLine> list) {
        this.list = list;
    }
    public void addtoList(OrderLine orderline) {
        list.add(orderline);
    }


    private List<OrderLine> list;

}
