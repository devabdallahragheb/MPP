package homework.lab3.pro3.task1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double ComputeArea() {
        return Math.PI * radius * radius;
    }
}
