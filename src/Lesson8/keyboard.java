package Lesson8;


import java.util.ArrayList;
import java.util.Scanner;

public class keyboard {
    public static void main(String[] args) {
        readData();

    }

    public static void readData() {
        ArrayList list = new ArrayList();
        try {
            while (true) {
                Scanner sc = new Scanner(System.in);
                float number = sc.nextFloat();
                list.add(number);
            }
        } catch (Exception e) {
            for (Object number : list) {

                System.out.println(number);
            }
        }
    }
}


