// 1. Given a string. Write a code that will create a new string made of the first two characters of the initial string.
//If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
package Lesson3;


public class HomeTask1 {
    public static void main(String[] args) {

        String a = "AE_1381";
        if (a.length() >= 2) {
            System.out.println(a.substring(0, 2));
        }
        else
            System.out.println(a);
    }
}
