package Lesson4;
// Write your own example of the recursive function. You can find a lot of examples on the Internet.
public class HomeTask9 {
public static void main(String[]args){
int factorial = factorialExample(5);
System.out.println(factorial);
}
public static int factorialExample(int value) {
    if (value == 1)
    {
        return 1;
    }

    return value * factorialExample(value - 1);



    }
}



