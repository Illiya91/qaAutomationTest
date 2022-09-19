//Given credit card's number 1234 5678 9012 3456. Print card's number in the next view **** **** **** 3456.

package Lesson3;

public class HomeTask8 {
    public static void main(String[] args){
        StringBuilder strBuilder = new StringBuilder("1234 5678 9012 3456");
        strBuilder.replace(0, 14, "**** **** ****");
        System.out.println(strBuilder);

    }
}
