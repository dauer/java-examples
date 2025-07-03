package sealed;

//final class BrokenLight implements TrafficLight {} // ERROR not defined to implement TrafficLight
final class FlashingLight implements TrafficLight {} // OK since it is listed in the permits section

public class SealedClassesExample {

    public static void main(String[] args) {
        TrafficLight trafficLight = new RedLight();
        System.out.println("Ok");
    }

}
