public class Shuttle implements IStart {

    @Override
    public boolean checkSystems() {
        return (int) (Math.random() * 10) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели шатла запущены.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла!");
    }
}
