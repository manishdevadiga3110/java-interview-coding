package Java8Stream.Easy;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> result = listOfList.stream().flatMap(List::stream).toList();
        System.out.println(result);
    }
}
