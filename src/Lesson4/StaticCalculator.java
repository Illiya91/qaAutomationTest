package Lesson4;

public class StaticCalculator {
    double firstValue;
    double secondValue;
    String operation;


    public StaticCalculator(double a,double b,String c) {
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
                result = Calculation();
        }
        return result;
        }


}


