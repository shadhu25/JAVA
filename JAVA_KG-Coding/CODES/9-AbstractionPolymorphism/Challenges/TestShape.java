package _10AbstractionPolymorphism.Challenges;

public class TestShape {
    public static void main(String[] args) {
        Circle c1=new Circle(22.0);
        Square s1=new Square(22.0);
        System.out.println(c1.calculateArea());
        System.out.println(s1.calculateArea());
        Shape S1=new Shape();
        Shape S2=new Circle(33.0);
        Shape S3=new Square(33.0);
        System.out.println(S1.calculateArea());
        System.out.println(S2.calculateArea());
        System.out.println(S3.calculateArea());
//        S1.Circle1();
        ((Circle) S2).Circle1();
        ((Square) S3).Square1();
        castTest(S1);
        castTest(S2);
        castTest(S3);
    }
    private static void castTest(Shape S){
        System.out.println(S.calculateArea());
    }
}
