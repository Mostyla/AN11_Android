package HomeTask9_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        final String[] mainFile = readFile(new File("D:/sentenses.txt"));
        final String[] blackListFile = readFile(new File("D:/blacklist.txt"));
        checkFiles(mainFile, blackListFile);
    }

    private static String[] readFile(final File file) throws IOException { //читаем исходный файл
        ArrayList<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String read;
        while ((read = br.readLine()) != null) {
            if (!read.isEmpty()) {
                words.add(read);
            }
        }
        return words.toArray(new String[0]);
    }

    public static void checkFiles(final String[] blackListFile, final String[] mainFile){
        boolean isChek = true;
        for (String badWords: blackListFile) {
            for (String strCheck : mainFile) {
                if (strCheck.toLowerCase().contains(badWords)) {
                    isChek = false;
                    System.out.println("Слово из blackList'a: " + badWords);
                }
            }
        }
        if (isChek){
            System.out.println("Проверка пройдена!");
        }
    }
}
