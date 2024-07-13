package homework.lab8.Answer4;
import java.util.List;
import java.util.function.Predicate;

public class WordCounter {
    public int countWords(List<String> words, char c, char d, int len) {
        Predicate<String> lengthCheck = word -> word.length() == len;
        Predicate<String> containsC = word -> word.indexOf(c) >= 0;
        Predicate<String> notContainsD = word -> word.indexOf(d) == -1;

        return (int) words.stream()
                .filter(lengthCheck)
                .filter(containsC)
                .filter(notContainsD)
                .count();
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        int result = wordCounter.countWords(words, 'a', 'e', 5);
        System.out.println(result);  // Output should be the number of words that meet the criteria
    }
}
