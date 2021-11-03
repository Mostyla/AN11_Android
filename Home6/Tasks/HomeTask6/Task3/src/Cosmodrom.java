public class Cosmodrom {
   public void start(IStart start) throws InterruptedException {
        if (!start.checkSystems()) {
            System.out.println("Предстартовая проверка провалена!");
        } else
            start.startEngine();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        start.start();
    }
}
