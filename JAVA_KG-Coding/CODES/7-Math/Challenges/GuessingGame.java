package _8Math.Challenges;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class GuessingGame {
    int random;
    GuessingGame(){
        random = (int)Math.ceil(Math.random()*100);
    }

    /**
     *
     * @param number the number that player guessed.
     * @return
     * - Negative when the guessed number is smaller.
     * - 0 when the guessed number is correct.
     * - Positive when the guessed number is bigger.
     */
    int guess(int number){
        return number-random;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        GuessingGame krishnGame=new GuessingGame();
        System.out.print("Welcome to the guessing game....  ");
        System.out.println("Guess the number between 1-100");
        int guess, result;
        do {
            System.out.print("Guess the number: ");
            guess=input.nextInt();
            result=krishnGame.guess(guess);
            if (result==0)
                System.out.println("Congrats, your guess is correct");
            else if (result<0)
                System.out.println("Please guess higher");
            else
                System.out.println("Please guess lower");
        }while (result != 0);

    }
}
