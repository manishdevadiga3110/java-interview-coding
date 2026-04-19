package Java8Stream.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListStringAsSingleString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hi", "Hello", "Manish");
        String result = words.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(result);
    }
}
