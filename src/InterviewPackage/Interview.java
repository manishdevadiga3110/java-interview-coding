package InterviewPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {

        String str = "My name is Sudhanshu";
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        Map<String, Long> response2 = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(wrd -> wrd, Collectors.counting()));
        System.out.println(response2);

        List<String> list = Arrays.asList("apple", "banana", "orange", "apple", "banana", "", null);
        Map<String, Long> result3 = list.stream()
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result3);

    }

}
