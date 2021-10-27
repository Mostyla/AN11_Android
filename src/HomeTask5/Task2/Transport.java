package HomeTask5.Task2;

public abstract class Transport {

   private final int horsePower;
   private final int maxspeed;
   private final int weight;
   private final String model;

    public Transport(int horsePower, int maxspeed, int weight, String model) {
        this.horsePower = horsePower;
        this.maxspeed = maxspeed;
        this.weight = weight;
        this.model = model;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public int getMaxspeed(){
        return maxspeed;
    }

    public int getWeight(){
        return weight;
    }

    public String getModel(){
        return model;
    }

}
