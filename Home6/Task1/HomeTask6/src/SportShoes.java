public class SportShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Обуть спортивную обувь.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять спортивную обувь.");

    }
}
