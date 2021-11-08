package HomeTask5.Task2;


public class Main {
    public static void main(String[] args) {
        System.out.println("Тех. хар-ки легкового а/м: ");
        Passenger passenger = new Passenger(152, 280, 2300, "BMW", 4, 10, "Седан", 5);
        passenger.displayInfo();
        System.out.println("Расчёт макс. расстояния: ");
        passenger.openCalculateTime();
        System.out.println();

        System.out.println("Тех. хар-ки грузового а/м: ");
        Cargo cargo = new Cargo(500, 120, 15000, "MAZ", 8, 40, 6.5);
        cargo.displayInfo();
        System.out.println("Расчёт макс. грузоподьёмности (т): ");
        cargo.CalculateWeight(5.5);
        System.out.println("Допустимая грузоподьёмность 6.5 тонн!");
        System.out.println();

        System.out.println("Тех. хар-ки военного самоёлта: ");
        Military military = new Military(1000, 400, 10000, "ИЛ-76", 10, 1000, true, 0);
        military.displayInfo();
        System.out.println("Проверка боекомплекта самолёта: ");
        military.shot();
        System.out.println("Проверка на наличие сис-мы катапультирования: ");
        military.checkCatapylting();
        System.out.println();

        System.out.println("Тех. хар-ки гражданского самолёта: ");
        Civil civil = new Civil(800,350,15000,"Боинг",20,1500,450,true);
        civil.displayInfo();
        System.out.println("Расчёт вместительности пассажиров: ");
        civil.CalculatePassangers(300);
    }
}
