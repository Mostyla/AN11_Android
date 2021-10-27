package HomeTask5.Task2;

public class Air extends Transport {
     private final int wingSpan;
     private final int minLength;

    public Air(int horsePower, int maxspeed, int weight, String model, int wingSpan, int minLength) {
        super(horsePower, maxspeed, weight, model);
        this.minLength = minLength;
        this.wingSpan = wingSpan;
    }


    public int getWingspan(){
        return wingSpan;
    }
    public int getMinlength(){
        return minLength;
    }
    public double getPower() {
        return getHorsePower() * 0.74;
    }


}
