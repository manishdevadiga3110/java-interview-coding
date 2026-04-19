package Java8Stream.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenOrOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> resultMap = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(resultMap);

        // even
        System.out.println("Even numbers: " + resultMap.get(true));

        //false
        System.out.println("Odd numbers: " + resultMap.get(false));


    }
}
