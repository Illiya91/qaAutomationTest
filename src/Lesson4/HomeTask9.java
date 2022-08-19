package Lesson4;

public class HomeTask9 {
    double firstValue;
    double secondValue;
    String operation;


    public HomeTask9(double a,double b,String c) {
        firstValue = a;
        secondValue = b;
        operation = c;

    }

    public double Calculation() {
        double result;
        switch (operation) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                result = firstValue / secondValue;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = Calculation();                            //Рекурсия
        }
        return result;
    }


}


