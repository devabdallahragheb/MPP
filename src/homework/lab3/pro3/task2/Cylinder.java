package homework.lab3.pro3.task2;

import homework.lab3.pro3.task1.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public double getHeight() {
        return height;
    }

    public double ComputeVolume() {
        return base.ComputeArea() * height;
    }
}
