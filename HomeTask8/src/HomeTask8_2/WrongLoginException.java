package HomeTask8_2;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        System.out.println("error!");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
