package homework.lab8.Answer6;

import java.util.function.Function;
import java.util.function.Predicate;

public class Examples {

    Function<String, String> toUpper2 = String::toUpperCase;
    Function<Integer, Integer> square = n -> n * n;
    Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();


    // Evaluator method
    public void evaluator() {
        
        System.out.println(toUpper2.apply("hello"));
        System.out.println(square.apply(5));
        System.out.println(reverse.apply("world"));
    }




    public static void main(String[] args) {
        Examples examples = new Examples();
        examples.evaluator();
    }
}
