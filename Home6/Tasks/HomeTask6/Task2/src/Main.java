public class Main {
    public static void main(String[] args) {

        Greeter EnglishGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hello world!");
            }
        };

        Greeter GermanGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Guten Tag!");
            }
        };

        Greeter FrenchGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Bonjour!");
            }
        };

        Greeter PolishGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Dzien Dobry!");
            }
        };

        Greeter RussianGreeter = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Привет Мир!");
            }
        };

        RussianGreeter.wish();
        PolishGreeter.wish();
        GermanGreeter.wish();
        EnglishGreeter.wish();
        FrenchGreeter.wish();
    }
}
