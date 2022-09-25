package Lesson9;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class MyFileTXT {

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, List<String>> songWords = new HashMap<String, List<String>>();
        String separator = File.separator;
        String path = separator + "D:" + separator + "song.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.replaceAll("[,?!-.]", "").toLowerCase();
            String[] splited = line.split("\\s+");
            for (String word : splited) {
                List<String> sameWords = songWords.get(word.trim());
                if (sameWords != null) {
                    sameWords.add(word.trim());
                } else {
                    sameWords = new ArrayList<String>();
                    sameWords.add(word.trim());
                    songWords.put(word.trim(), sameWords);
                }
            }
            System.out.println(String.format("Amount of unique words: %s", songWords.size()));
            int bigestSize = 0;
            String bigestSizeKey = "";
            for (String key : songWords.keySet()) {
                List<String> sameWords = songWords.get(key);
                System.out.println(String.format("%s appeared in text %s times", key, sameWords.size()));
                if (sameWords.size() > bigestSize) {
                    bigestSize = sameWords.size();
                    bigestSizeKey = key;
                }
            }
            System.out.println(String.format("The most frequente word is: %s", bigestSizeKey));
        }
    }
}













//System.out.println(scanner.nextLine());
//String str = scanner.nextLine();
//String[] subStr;
//String delimeter = "-"; // Разделитель
//subStr = str.split(delimeter);
//for(int i = 0; i < subStr.length; i++) {
//System.out.println(subStr[i]);






