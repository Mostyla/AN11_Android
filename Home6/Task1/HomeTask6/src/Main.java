public class Main {
    public static void main(String[] args) {
        Human human = new Human(new DenimJacket(), new CasualShoes(), new JeansTrousers(), "Артём");
        Human human1 = new Human(new DownJacket(), new SportShoes(), new SportTrousers(), "Виталий");

        human.getDressed();
        System.out.println();
        human.unDressed();
        System.out.println();

        human1.unDressed();
        System.out.println();
        human1.getDressed();
        System.out.println();

    }
}