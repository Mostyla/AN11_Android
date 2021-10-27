package HomeTask5.Task2;

public class Military extends Air {
   private final boolean catapulting;
   private final int numberOfRocket;

    public Military(int horsePower, int maxspeed, int weight, String model, int wingSpan, int minLength, boolean catapulting, int numberOfRocket) {
        super(horsePower, maxspeed, weight, model, wingSpan, minLength);
        this.catapulting = catapulting;
        this.numberOfRocket = numberOfRocket;
    }


    public boolean isCatapulting(){
        return catapulting;
    }
    public int getNumberOfRocket(){
        return numberOfRocket;
    }
    public void shot(){
    if (getNumberOfRocket() != 0){
        System.out.println("Ракета пошла...");
    } else {
        System.out.println("Боекомплект пуст!");
    }
    }
    public void checkCatapylting(){
        if (!isCatapulting()){
            System.out.println("Катапультирование прошло успешно!");
        }else {
            System.out.println("У вас отсутствует такая сис-ма!");
        }
    }
    public void displayInfo() {
        System.out.println("Мощность (кВт): " + getPower() + "\n" +
                "Максимальная скорость: " + getMaxspeed() + " км/ч" + "\n" +
                "Масса (кг): " + getWeight() + "\n" +
                "Марка: " + getModel() + "\n" +
                "Размах крыльев (м): " + getWingspan() + "\n" +
                "Минимальная длина взлётно-посадочной полосы для взлёта: " + getMinlength() + " метров " + "\n" +
                "Катапультирование: " + isCatapulting() + "\n" +
                "Кол-во ракет: " + getNumberOfRocket() + "\n");
    }


}
