package HomeTask9_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String sourceFile  = "D:/text.txt";
        final String palindromeFile = "D:/result.txt";
        readFile(sourceFile , palindromeFile);
    }

    private static void readFile(final String sourceFile, final String palindromeFile) throws IOException { // метод читает файл и отправляет его на проверку
        List<String> strings = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {
            String check;
            while ((check = bufferedReader.readLine()) != null) {
                if (isPalindrome(check)){
                    strings.add(check);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arr = strings.toArray(new String[0]);
        newFile(arr, palindromeFile);
    }

    private static boolean isPalindrome(final String check) { // проверка, палиндромная ли строка
        if (check.length() >= 3){
            return check.equalsIgnoreCase(new StringBuilder(check).reverse().toString());
        } else return false;
    }
    private static void newFile(String[] strings, String address) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(address))){
            for (String string: strings){
                if (string != null && !string.isEmpty()){

                    bufferedWriter.write(string);
                    bufferedWriter.append('\n');
                    bufferedWriter.flush();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
