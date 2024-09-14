package _10AbstractionPolymorphism.Challenges;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }
    void Square1(){
        System.out.println("Square");
    }
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
