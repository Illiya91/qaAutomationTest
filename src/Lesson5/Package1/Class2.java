package Lesson5.Package1;

public class Class2 extends Class1{
    public Class2(int x, int y, int z) {
        super(x, y, z);
    }

    public static void main(String[] args){
        Class1 x = new Class1(3,5,7);
        Class1 y = new Class1(2,4,4);
        Class1 z = new Class1(5,5,6);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
