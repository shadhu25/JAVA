package _14FunctionalProgramming.Challenge;

import java.util.List;
import java.util.function.Predicate;

public class OddNumbers {
    boolean test;
    public boolean oddNumbers(boolean test) {
        return true;
    }
    public static void main(String[] args) {
         List<Integer> numbers=List.of(33,43,24,56,70,32,12,33,44,87,67,53);
        numbers.stream().filter(number->number%2!=0).forEach(num-> System.out.println(num));
        int x=-9;
        Test<Integer> test=var->var>0;
        System.out.println(test.test1(x));
        Predicate<Integer> isPositive=m->m>0;
        System.out.println(isPositive.test(x));
    }
}
