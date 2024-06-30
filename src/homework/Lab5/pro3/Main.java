package homework.Lab5.pro3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Triangle(3, 4));
        shapes.add(new Circle(2));

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.computeArea();
        }

        System.out.println("Sum of Areas = " + totalArea);
    }
}