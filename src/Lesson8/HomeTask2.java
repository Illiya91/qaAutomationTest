package Lesson8;

public class HomeTask2 {
    public static void main(String[] args) {

        try {
            System.out.println(divideByZero());
        } catch (ArithmeticException e) {


        }
    }
    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;

    }
}

