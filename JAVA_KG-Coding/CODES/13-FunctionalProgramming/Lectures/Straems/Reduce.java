package _14FunctionalProgramming.Lectures.Straems;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
        // Addition normally
        int sum=0;
        for (Integer number : numbers) {
            sum+=number;
        }
        System.out.println("The final sum: "+sum);
        // Addition by stream
        sum=numbers.stream().reduce(0,new BinaryOperator<Integer>(){
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });
        // Addition by Stream with lambda
        System.out.println("The final sum: "+sum);
        sum=numbers.stream().reduce(0,(number1,number2)->number1+number2);
        System.out.println("The final sum: "+sum);
        System.out.println(Integer.MIN_VALUE);
        sum=numbers.stream().reduce(Integer.MIN_VALUE,(number1,number2)->number1>number2?number1:number2);
        System.out.println("Max value: "+sum);

    }
}
