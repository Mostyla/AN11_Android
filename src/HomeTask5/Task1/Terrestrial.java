package HomeTask5.Task1;

public class Terrestrial extends Transport {

    //Наземный

    private final int numberOfWheels;
    private final double fuelConsumption;

    public Terrestrial(int power, int maxspeed, int weight, String model, int numberOfWheels, double fuelConsumption) {
        super(power, maxspeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
