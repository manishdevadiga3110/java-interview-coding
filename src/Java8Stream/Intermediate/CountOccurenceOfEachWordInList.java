package Java8Stream.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfEachWordInList {
    public static void main(String[] args) {

        List<String> word = Arrays.asList("Apple", "Apple", "Banana", "Grape", "Grape", "Guava", "Chikoo", "Dog", "Bird");
        Map<String, Long> count = word.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);
    }
}
