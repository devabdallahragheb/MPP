package homework.lab8.Answer1;

import java.util.function.Supplier;

public class Main {

    Supplier<Double> S = () -> Math.random();

    class innerClass implements Supplier{
        @Override
        public Object get() {
            return Math.random();
        }
    }
    public static void main(String[] args) {

        innerClass randomSupplier = new Main().new innerClass();
        System.out.println(randomSupplier.get());
    }
}
