package _14FunctionalProgramming.Challenge;

import java.util.List;

public class StreamString {
    public static void main(String[] args) {
        List<String> string=List.of("Krishna","Radha","Ram","Sita");
        string.stream().forEach(name-> System.out.println(name));
    }
}
