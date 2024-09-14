package _8Math.Challenges;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to calculate circle area platform" );
        System.out.print("Please enter the radius: ");
        float radius=input.nextFloat();
        float area=calArea(radius);
        System.out.println("Area: "+area);
    }
    static float calArea(float radius){
        return (float)(Math.PI*Math.pow(radius,2));
    }
}
