package Lesson6;



class A{     //Створюєм класс.
    public int Sum(int firstNumber, int secondNumber){   //
        return firstNumber + secondNumber;
    }
}

class B{
    public void Print(String message){
        System.out.println(message);
    }

    public void toString(int result) {
    }
}

class C{
    private C mathOperator;
    private B consolePrinter;

    public C()
    {
        this.mathOperator = new C();
        this.consolePrinter = new B();
    }

    public int CalculateSum(int firstNumber, int secondNumber){
        int result = mathOperator.CalculateSum(firstNumber, secondNumber);
        consolePrinter.Print(result+"");
        return result;
    }


    public static void main(String[]args){
        C c = new C();
c.CalculateSum(1, 2);
    }
}
