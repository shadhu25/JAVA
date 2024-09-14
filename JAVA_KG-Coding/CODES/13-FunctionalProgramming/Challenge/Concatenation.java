package _14FunctionalProgramming.Challenge;

import java.util.List;

public class Concatenation {
    public static void main(String[] args) {
        List<String> name=List.of("Prashant Jain","bad","is teaching java","ghatiya","ganda","on KG codding","Best Youtube programming channel");
        String result=name.stream().filter(names->names.length()>10).reduce("",(a,b)->a+" "+b);
        System.out.println(result);
    }
}
