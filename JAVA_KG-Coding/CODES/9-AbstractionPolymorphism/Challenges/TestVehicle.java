package _10AbstractionPolymorphism.Challenges;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Car c=new Car();
        v.service();
        c.service();
    }
}
