package Lesson5;

public class HomeTask3 {
    // Write your own example of the recursive function. You can find a lot of examples on the Internet.
    public class Recursia {
        public void main(String[] args){
            int factorial = factorialExample(5);
            System.out.println(factorial);
        }
        public int factorialExample(int value) {
            if (value == 1)
            {
                return 1;
            }

            return value * factorialExample(value - 1);



        }
    }
}
