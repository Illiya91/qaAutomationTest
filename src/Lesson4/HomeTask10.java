package Lesson4;

public class HomeTask10 {
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
    HomeTask10 overload = new HomeTask10();
    System.out.println(overload.OverloadedMethod(5, 5));
    System.out.println(overload.OverloadedMethod(5.5, 5));
    }
    }


