package homework.lab7.Q2;

public class Ellipse implements ClosedCurve{
    double a ;
    double E ;

    public Ellipse(double a, double e) {
        this.a = a;
        E = e;
    }

    @Override
    public double computePerimeter() {
        return 4 * a *E;
    }
}
