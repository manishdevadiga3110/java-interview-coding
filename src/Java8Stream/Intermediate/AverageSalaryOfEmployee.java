package Java8Stream.Intermediate;

import Java8Stream.Easy.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1, "Manish", 25000.0),
                new Employee(2, "Mathesh", 700000.0),
                new Employee(3, "Mahesh", 800000.0),
                new Employee(4, "Mahendra", 10000.0)
        );

        Double average = employee.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(average);

//        average of id
        Double averageId = employee.stream().collect(Collectors.averagingInt(Employee::getId));
        System.out.println(averageId);

//        OR
        double averageIdMapToInt = employee.stream().mapToInt(Employee::getId).average().orElse(0);
        System.out.println(averageIdMapToInt);
    }
}
