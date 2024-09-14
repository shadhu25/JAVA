package _8Math.Challenges;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("The game is started......");
        diceRoll();
    }
    static  void diceRoll(){
        System.out.println(Math.ceil((Math.random()*6)));
        Scanner input=new Scanner(System.in);
        System.out.print("Do you wanna roll again.. to press y or else press any key: ");
        char ch=input.next().charAt(0);
        if(ch=='y'||ch=='Y')
            diceRoll();
    }
}
