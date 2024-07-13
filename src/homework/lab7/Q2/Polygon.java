package homework.lab7.Q2;

public interface Polygon extends ClosedCurve {

    @Override
    default double computePerimeter() {
        double sum=0;
        for(double d : getLenghts()){
            sum+=d;
        }
        return sum;
    }

    double[] getLenghts();
}
