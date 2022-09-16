package Lesson8;



public class HomeTask1 {
    int number;

    public void method(int value) {
        number = value;
        if (number < 0) {
            System.out.println("Number < 0");
        }
        if (number > 0) {
            System.out.println("Number > 0");
        }
        if (number == 0) {
            try {
                throw new ArithmeticException("Error example");
            } catch (ArithmeticException e) {
                System.out.println("Exception");
            }


                }
            }



            public static void main(String[] args) {
    HomeTask1 homeTask1 = new HomeTask1();
    homeTask1.method(0);


    }
}


