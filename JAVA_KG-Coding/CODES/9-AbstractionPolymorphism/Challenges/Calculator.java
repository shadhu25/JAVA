package _10AbstractionPolymorphism.Challenges;

public class Calculator {
    private static double add(int a, int b){
        System.out.println("Two int");
        return a+b;
    }
    private static double add(int a, int b, int c){
        System.out.println("Three int");
        return a+b+c;
    }
    private static double add(double a, double b){
        System.out.println("Two double");
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.2,2.3));
    }
}
