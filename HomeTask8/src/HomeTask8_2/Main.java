package HomeTask8_2;

public class Main {
    public static boolean admPanel(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {

        boolean isCorrectData = true;

        try {
            if (login.length() > 20) {
                System.out.println("Выход за допустимый диапазон логина!");
                throw new WrongLoginException();
            }

        } catch (WrongLoginException e) {
            System.out.println(e);
            isCorrectData = false;
        }

        try {
            if (password.length() > 20) {
                System.out.println("Вы вышли за допустимый диапазон пароля!");
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException p) {
            System.out.println(p);
            isCorrectData = false;
        }

        try {
            if (!password.equals(confirmPassword)){
                System.out.println("Пароли не совпадают!");
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException p) {
            System.out.println(p);
            isCorrectData = false;
        }

        return isCorrectData;
    }

    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {

            System.out.println(admPanel("Andrey99Mostyka", "qweasdzxc111111pass", "qweasdzxc111111pass"));

    }
}
