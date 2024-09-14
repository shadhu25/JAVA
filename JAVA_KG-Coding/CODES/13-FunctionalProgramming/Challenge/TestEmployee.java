package _14FunctionalProgramming.Challenge;

import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> empls= List.of(
                new Employee("Krishn",2000),
                new Employee("Radha",992000),
                new Employee("Sudama",2000),
                new Employee("Ram",200000),
                new Employee("Sita",20));
        empls.stream().sorted((emp1,emp2)->Double.compare(emp1.getSalary(),emp2.getSalary())).forEach(System.out::println);
        System.out.println(empls);
    }
}
