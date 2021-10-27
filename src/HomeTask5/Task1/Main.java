package HomeTask5.Task1;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(152, 280, 2300, "BMW", 4, 10, "Седан", 5);
        passenger.displayInfo();
        passenger.calculateTime(2.5);
    }
}
