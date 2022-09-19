package Lesson2;

public class HomeTask3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 30) - 10);
            System.out.println(array[i]);
        }
        }
    }