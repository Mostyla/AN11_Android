package HomeTask5.Task2;

public class Cargo extends Terrestrial{
    private final double carryIngcapacity;

    public Cargo(int power, int maxspeed, int weight, String model, int numberOfWheels, double fuelConsumption,double carryIngcapacity) {
        super(power, maxspeed, weight, model, numberOfWheels, fuelConsumption);
        this.carryIngcapacity = carryIngcapacity;
    }


    public double getCarryIngcapacity(){
        return carryIngcapacity;
    }
    public void displayInfo() {
        System.out.println("Мощность (кВт): " + getPower() + "\n" +
                "Максимальная скорость: " + getMaxspeed() + " км/ч" + "\n" +
                "Масса (кг): " + getWeight() + "\n" +
                "Марка: " + getModel() + "\n" +
                "Количество колёс: " + getNumberOfWheels() + "\n" +
                "Расход топлива: " + getFuelConsumption() + "л/100км " + "\n" +
                "Максимальная грузоподьёмность(тонн): " + getCarryIngcapacity() + "\n");
    }

    public void CalculateWeight(double weight){
        if(weight > getCarryIngcapacity()){
            System.out.println("Вам нужен грузовик побольше!");
        }else {
            System.out.println("Грузовик загружен!");
        }
    }
}
