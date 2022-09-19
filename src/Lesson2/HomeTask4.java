package Lesson2;

public class HomeTask4 {
    public static void main(String[] args) {
        int[] array1 =  {2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        int[] array2 = new int [10];
        int i;
        for (i = 0; i < array1.length; i++) {
            array2[i] = (int) (Math.sqrt(array1[i]));
            System.out.println(""+array2[i]);
        }




    }
}
