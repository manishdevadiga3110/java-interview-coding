package Java8Stream.Intermediate;

import Java8Stream.Easy.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1, "Manish", 25000.0),
                new Employee(2, "Mathesh", 700000.0),
                new Employee(3, "Mahesh", 800000.0),
                new Employee(4, "Mahendra", 10000.0)
        );

        List<Employee> result = employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();
        System.out.println(result);
    }
}
