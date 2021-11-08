public class Human {
    private final String name;
    private Jacket jacket;
    private Shoes shoes;
    private Trousers trousers;

    public Human(Jacket jacket, Shoes shoes, Trousers trousers, String name) {
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
        this.name = name;
    }

    public void getDressed() {
        if (jacket != null) {
            jacket.putOn();
        }
        if (shoes != null) {
            shoes.putOn();
        }
        if (trousers != null) {
            trousers.putOn();
        }
        System.out.println(name + " полностью одет");
    }

    public void unDressed() {
        if (jacket != null) {
            jacket.takeOff();
        }
        if (shoes != null) {
            shoes.takeOff();
        }
        if (trousers != null) {
            trousers.takeOff();
        }
        System.out.println(name + " полностью раздет");
    }
}
