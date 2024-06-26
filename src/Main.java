import homework.prob2A.Student;
import homework.prob2B.Order;
import homework.prob2B.OrderLine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println("student contains grade report: " + stu.getGradeReport());


        Order order  = new Order();
        OrderLine oline1 = new OrderLine(order);
        OrderLine line2 = new OrderLine(order);
        System.out.println("Order contains list: " + order.getList().size());
        System.out.println("OrderLine contains order: " + oline1.getOrder());
        System.out.println("OrderLine contains order: " + line2.getOrder());
    }
}