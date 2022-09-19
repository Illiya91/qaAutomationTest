package Lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.io.File.separator;

public class HomeWork1 {

public static void main(String[] args) throws IOException, IOException {

    String pathFile1 = "C:" + separator + "Users" + separator + "Kravchenko Illiya" + separator + "OneDrive" + separator + "Рабочий стол" + separator +"Test1.txt";
    String pathFile2 = "C:" + separator + "Users" + separator + "Kravchenko Illiya" + separator + "OneDrive" + separator + "Рабочий стол" + separator +"Test2.txt";
    String separator = File.separator;

    FileInputStream input = new FileInputStream(pathFile1);
        FileOutputStream output = new FileOutputStream(pathFile2);

        while(input.available() > 0) {
        int data = input.read();
        output.write(data);
        }

        input.close();
        output.close();
        }
        }
