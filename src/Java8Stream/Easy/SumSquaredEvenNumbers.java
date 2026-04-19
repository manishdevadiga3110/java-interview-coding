package Java8Stream.Easy;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumSquaredEvenNumbers {
    public static void main(String[] args) {
    /*    int[] numbers = {1, 2, 3, 4};

        int result = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sum();
        System.out.println(result);
*/
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(Integer::sum);
        System.out.println(result.get());


    }
}
