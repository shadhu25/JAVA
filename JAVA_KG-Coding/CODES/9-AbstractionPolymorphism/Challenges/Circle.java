package _10AbstractionPolymorphism.Challenges;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }
    void Circle1(){
        System.out.println("Circle");
    }
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
