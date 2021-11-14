package HomeTask8_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100,10000,"bmw");
        Car car1 = new Car(120,5000,"audi");
        Car car2 = new Car(120,5000,"VW");

        car.start();
        car1.start();
        car2.start();
    }
}
