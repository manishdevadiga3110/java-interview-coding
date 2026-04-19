package Java8Stream.Intermediate;

import Java8Stream.Easy.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlldeptWithMoreThan2Employee {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1, "Manish", "IT", 25000.0),
                new Employee(2, "Mathesh", "Account", 700000.0),
                new Employee(3, "Mahesh", "HR", 800000.0),
                new Employee(4, "Mahendra", "HR", 10000.0),
                new Employee(5, "Manasa", "HR", 210000.0)
        );

        List<String> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment
                        , Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey).toList();
        System.out.println(collect);
    }
}

