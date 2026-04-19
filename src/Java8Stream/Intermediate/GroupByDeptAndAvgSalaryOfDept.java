package Java8Stream.Intermediate;

import Java8Stream.Easy.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDeptAndAvgSalaryOfDept {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1, "Manish", "IT", 25000.0),
                new Employee(2, "Mathesh", "Account", 700000.0),
                new Employee(3, "Mahesh", "HR", 800000.0),
                new Employee(4, "Mahendra", "HR", 10000.0)
        );

        Map<String, Double> result = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(result);
    }
}
