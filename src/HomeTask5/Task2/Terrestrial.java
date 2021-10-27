package HomeTask5.Task2;

public class Terrestrial extends Transport {

    //Наземный

    private final int numberOfWheels;
    private final double fuelConsumption;

    public Terrestrial(int horsePower, int maxspeed, int weight, String model, int numberOfWheels, double fuelConsumption) {
        super(horsePower, maxspeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getPower() {
        return getHorsePower() * 0.74;
    }
}
