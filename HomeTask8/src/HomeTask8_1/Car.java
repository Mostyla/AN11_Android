package HomeTask8_1;

public class Car {
        private double speed;
        private double price;
        private String model;

        public Car(double speed, double price, String model) {
            this.speed = speed;
            this.price = price;
            this.model = model;
        }

        public Car() {
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void start() {
            int random_number1 = (int) (Math.random() * 20);
            try {
                if (random_number1 % 2 == 0) {
                    throw new StartCarException();
                } else {
                    System.out.println("Model: " + model + " завёлся!");
                }
            }catch (StartCarException e){
                System.out.println(e);
            }

        }
}
