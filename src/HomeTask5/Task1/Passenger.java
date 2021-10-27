package HomeTask5.Task1;

public class Passenger extends Terrestrial {

    private final String bodyType;
    private final int numberOfPassenger;

    public Passenger(int power, int maxspeed, int weight, String model, int numberOfWheels, double fuelConsumption, String bodyType, int numberOfPassenger) {
        super(power, maxspeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    private double getPower() {
        return getHorsePower() * 0.74;
    }

    public void calculateTime(double time) {
       double km = getMaxspeed() * time;
       double fuelConsumption = (getFuelConsumption() * km) / 100;

       System.out.println("За время " + time + " ч, автомобиль " + getModel() + " двигаясь с максимальной скоростью " +
               getMaxspeed() + " км/ч проедет " + km + " км и израсходует " + fuelConsumption + " л топлива");
    }

    public void displayInfo() {
        System.out.println("Мощность (кВт): " + getPower() + "\n" +
                "Максимальная скорость: " + getMaxspeed() + "\n" +
                "Масса (т): " + getWeight() + "\n" +
                "Марка: " + getModel() + "\n" +
                "Количество колёс: " + getNumberOfWheels() + "\n" +
                "Расход топлива: " + getFuelConsumption() + "\n" +
                "Тип кузова: " + getBodyType() + "\n" +
                "Количество пассажиров: " + getNumberOfPassenger() + "\n");
    }
}


