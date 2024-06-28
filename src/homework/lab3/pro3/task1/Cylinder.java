package homework.lab3.pro3.task1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double ComputeVolume() {
        return ComputeArea() * height;
    }
}
