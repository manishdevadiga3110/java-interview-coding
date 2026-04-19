package JavaBasic;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("a", "b", "c");

        Map <Integer, Integer> map = new HashMap<>();

        map.put(1,10);
        map.put(2,20);
        map.put(3,30);

        System.out.println(map.get(2));
//names.stream().forEach(System.out::println);
//names.stream().filter(s->s.startsWith("a")).forEach(System.out::println);

//        Stream<String> stream = names.stream();
//        stream.forEach(System.out::println);
//
//        stream.filter(s->s.startsWith("a")).forEach(System.out::println);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        Arrays.stream(numbers).filter(n -> n % 2 == 0).forEach(System.out::println);


    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return nums;
    }



}