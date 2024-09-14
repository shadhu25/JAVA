package _10AbstractionPolymorphism.Challenges;

public class Car extends Vehicle{
    void service(){
        super.service();
        System.out.println("Car is getting service......");
    }
}
