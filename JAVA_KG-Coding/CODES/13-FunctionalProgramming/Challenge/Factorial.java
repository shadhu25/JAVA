package _14FunctionalProgramming.Challenge;

import java.util.stream.IntStream;

public class Factorial {
    public static int givesFact(int fact){
        if(fact==0||fact==1)
            return 1;
        return fact*givesFact(fact-1);
    }
    public static void main(String[] args) {
        // calculating normally
        int fact=givesFact(5);
        System.out.println(fact);
        // calculating by functional programming
        int num=5;
        IntStream.rangeClosed(2,num).reduce((a,b)->a*b).ifPresent(System.out::println);
    }
}
