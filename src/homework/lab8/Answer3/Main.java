package homework.lab8.Answer3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {



    public static void main(String[] args) {
        BiFunction<Double,Double,List<Double>> Bi = new BiFunction<Double, Double, List<Double>>() {
            @Override
            public List<Double> apply(Double x, Double y) {
                List<Double> list = new ArrayList<>();
                list.add(Math.pow(x,y));
                list.add(x * y);
                return list;
            }
        };
        System.out.println(Bi.apply(3.0,3.0));
    }
}
