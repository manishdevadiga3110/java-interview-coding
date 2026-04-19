package Java8Stream.Easy;

import java.util.Arrays;
import java.util.List;

public class AverageofListInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        double result = numbers.stream()
                .mapToInt(Integer::intValue).
                average()
                .orElse(0.0);
        System.out.println(result);
    }
}
