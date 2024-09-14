package _12Collectionss.Lectures;

public class Enums {
    public static void main(String[] args) {
        // Enum
        TrafficLight signal=TrafficLight.RED;
        // static valueOf()
        signal=TrafficLight.valueOf("RED");
        System.out.println(signal);
        // static values()
        for (TrafficLight Signal : TrafficLight.values()) {
            System.out.println(Signal);
        }
    }
}
