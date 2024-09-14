package _14FunctionalProgramming.Challenge;

import java.util.function.BinaryOperator;

public class Addition {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi=(a,b)->a*b;
        int result=multi.apply(6,6);
        System.out.println(result);
    }
}
