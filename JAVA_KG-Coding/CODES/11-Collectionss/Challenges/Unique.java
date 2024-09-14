package _12Collectionss.Challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userStr=input.next();
        Set<Character> unique= new HashSet<>();
        for (Character c : userStr.toCharArray()) {
            unique.add(c);
        }
        System.out.printf("The total unique character in %s has %d.",userStr,unique.size());
    }
}
