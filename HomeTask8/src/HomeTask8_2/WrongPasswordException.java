package HomeTask8_2;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        System.out.println("error!");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
