package homework.lab8.Answer5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		list.forEach( s -> System.out.println(s.toUpperCase()));
		list.forEach(toUpperCaseAndPrint);
		list.forEach(toUpperCaseAndPrint::accept);
		
	}
	

	static Consumer<String>  toUpperCaseAndPrint = s -> System.out.println(s.toUpperCase());

}