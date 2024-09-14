package _9EncapsulatioInheritance.Challenges.com.example.utils;

import _9EncapsulatioInheritance.Challenges.com.example.geometry.Circle;
import _9EncapsulatioInheritance.Challenges.com.example.geometry.Rectangle;

import static java.lang.Math.*;

public class Calculator {
    public static float circleArea(float r){
        return (float)(PI *pow(r,2));
    }
    public static float rectangleArea(float l, float b){
        return l*b;
    }

    public static void main(String[] args) {
        Circle myCircle=new Circle(44);
        float cArea=circleArea(myCircle.getRadius());
        System.out.print("Area of circle is: "+cArea);
        Rectangle myRectangle=new Rectangle(55,77);
        float rArea=rectangleArea(myRectangle.getLength(),myRectangle.getWidth());
        System.out.print("Area of rectangle is: "+rArea);

    }
}
