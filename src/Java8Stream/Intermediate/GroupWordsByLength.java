package Java8Stream.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Grape", "Guava", "Chikoo", "Dog", "Bird");
        Map<Integer, List<String>> result = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
