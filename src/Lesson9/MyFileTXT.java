package Lesson9;


import com.sun.deploy.util.OrderedHashSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class MyFileTXT {

    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "D:" + separator + "song.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }


public void countWords(){

}


}















//System.out.println(scanner.nextLine());
//String str = scanner.nextLine();
//String[] subStr;
//String delimeter = "-"; // Разделитель
//subStr = str.split(delimeter);
//for(int i = 0; i < subStr.length; i++) {
//System.out.println(subStr[i]);






