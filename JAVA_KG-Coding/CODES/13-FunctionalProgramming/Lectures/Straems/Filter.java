package _14FunctionalProgramming.Lectures.Straems;

import java.util.List;
import java.util.function.Consumer;

public class Filter {
    public static void main(String[] args) {
        List<String> fruits=List.of("Apple","Banana","Mango","Cherry","Date");
        System.out.println(fruits.size());
        System.out.println("Printing normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Printing by stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("Printing by stream and filter with lambda");
        fruits.stream().filter(fruit->fruit.endsWith("e")).forEach(fruit-> System.out.println(fruit));
    }
}
