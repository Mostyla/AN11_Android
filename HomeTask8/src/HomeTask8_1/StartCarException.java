package HomeTask8_1;

public class StartCarException extends ArithmeticException{
    public StartCarException() {
        System.out.println("ERROR");
    }

    public StartCarException(String s) {
        super(s);
    }
}