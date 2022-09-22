package Lesson5;

//4. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

public class HomeTask4 {
    int num1;
    Double num3;
    int num2;


    int OverloadedMethod(int num1, int num2) {
        return num1 + num2;
    }

    Double OverloadedMethod(double num3, int num2) {
        return num3 + num2;
    }
    public static void main(String[] args){
        HomeTask4 overload = new HomeTask4();
        System.out.println(overload.OverloadedMethod(5, 5));
        System.out.println(overload.OverloadedMethod(5.5, 5));
    }
}


