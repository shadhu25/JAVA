package _11Exeption_or_File_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Class.forName;

public class Exceprions {
    public static void main(String[] args){
        // Checked or Compile time exception must be thrown or caught by try-catch block
        try {
            forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException krishn){
            System.out.println("Exception: "+krishn);
            krishn.printStackTrace();
        }
        catch (Exception krishn){
            System.out.println("Exception: "+krishn);
            System.out.println("mnbmfnsdb");
        }
        System.out.println("hi I am krishn");

        // Unchecked or Runtime Exception
        int a=22,b=0,c=0;
        try {
            c=a/b;
        }
        catch (Exception krishn){
            krishn.printStackTrace();
            System.out.println("Exception: "+krishn);
            System.out.println(krishn.getMessage());

        }
        finally {
            System.out.println(" i am in finally block");
        }
        System.out.println(c);
        // user defined Exception
        int age = 17;
        if(age<18)
            try {
                throw new YoungerAgeException("you are not aligible for vote");
            }
        catch (YoungerAgeException krishn){
            System.out.println("Exception: "+krishn);
            krishn.printStackTrace();
        }
        else
            System.out.println("you are aligible for vote");
        Scanner input=new Scanner(System.in);
        System.out.print("enter: ");
        do {
            try {
                int x=input.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.print("you have to enter an integer: ");
            }
            input.nextLine();
        }while (true);
    }

}
