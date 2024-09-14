package _14FunctionalProgramming.Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctString {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(2,1,3,2,5,6,4,3,7,5,5,2,1);
        List<Integer> distinctNumbers=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNumbers);;
    }
}
