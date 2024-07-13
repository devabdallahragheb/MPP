package homework.lab7.Q2;

public class EqTriangle implements Polygon{
    double side=0;

    public EqTriangle(double side) {
        this.side = side;
    }

    @Override
    public double[] getLenghts() {
        return new double[]{side,side,side};
    }
}
