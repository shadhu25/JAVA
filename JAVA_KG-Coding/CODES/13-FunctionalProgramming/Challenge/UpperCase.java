package _14FunctionalProgramming.Challenge;

import java.util.Optional;

public class UpperCase {
    public static Optional<String> toUpperCases(String str){
        if(str==null||str.isEmpty())
            return Optional.empty();
        return Optional.of(str.toUpperCase());
    }
    public static void main(String[] args) {
        Optional<String> string=toUpperCases(null);
        System.out.println(string);
        string=toUpperCases("");
        System.out.println(string);
        string=toUpperCases("krishn");
        System.out.println(string);
    }
}
