package Lesson2;

public class HomeTask7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) continue;
            if (i == array.length - 1) continue;
            sum = sum + array[i];

        }
        System.out.println(sum);
    }

}

