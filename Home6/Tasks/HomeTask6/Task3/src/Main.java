public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();

        Cosmodrom cosmodrom = new Cosmodrom();
        cosmodrom.start(spaceX);
        cosmodrom.start(shuttle);
    }
}
