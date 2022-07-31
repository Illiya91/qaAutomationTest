package Lesson2;

public class HomeTask9 {
    public static void main(String[] args){
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10));
            int dummy = array[i];
            array[i] = array[i];
            array[i] = dummy;
                for (int out = elems - 1; out >= 1; out--){  //Внешний цикл
                    for (int in = 0; in < out; in++){       //Внутренний цикл
                        if(a[in] > a[in + 1])               //Если порядок элементов нарушен
                            toSwap(in, in + 1);
                        System.out.println(array[i]);

        }
    }
}

