//
package Lesson2;

public class HomeTask9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 30));
        }
        for (int out = array.length - 1; out >= 1; out--) {  //Внешний цикл
            for (int in = 0; in < out; in++) {       //Внутренний цикл
                if (array[in] < array[in + 1]) {              //Если порядок элементов нарушен
                    int dummy = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = dummy;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

