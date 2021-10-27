package HomeTask5.Task2;

public class Civil extends Air  {
    int numberOfPassengers;
    boolean buisinessClass;

    public Civil(int horsePower, int maxspeed, int weight, String model, int wingSpan, int minLength, int numberOfPassengers, boolean buisinessClass) {
        super(horsePower, maxspeed, weight, model, wingSpan, minLength);
        this.numberOfPassengers = numberOfPassengers;
        this.buisinessClass = buisinessClass;
    }
    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }
    public boolean isBuisinessClass(){
        return buisinessClass;
    }
    public void CalculatePassangers(int peoples){
        if (peoples > getNumberOfPassengers()){
            System.out.println("Самолёт переполнен!");
        }else {
            System.out.println("Самолёт готов ко взлёту!");
        }
    }

    public void displayInfo() {
        System.out.println("Мощность (кВт): " + getPower() + "\n" +
                "Максимальная скорость: " + getMaxspeed() + "\n" +
                "Масса (кг): " + getWeight() + "\n" +
                "Марка: " + getModel() + "\n" +
                "Размах крыльев (м): " + getWingspan() + "\n" +
                "Минимальная длина взлётно-посадочной полосы для взлёта: " + getMinlength() + " метров" + "\n" +
                "Наличие бизнес класса: " + isBuisinessClass() + "\n" +
                "Кол-во пассажиров: " + getNumberOfPassengers() + "\n");
    }
}
