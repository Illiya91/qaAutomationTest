import java.util.Arrays;
public class HomeTask7 {


    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);
        secondArray[0] = 10;
        System.out.println(firstArray[0]);
        System.out.println(secondArray[0]);
        System.out.println(firstArray.length);
    }
}
