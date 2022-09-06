package Lesson5.Package2;

import Lesson5.Package1.Class1;

public class Class3 extends Class1 {
    public Class3(int x, int y, int z) {
        super(x, y, z);
    }

    public static void main(String[] args){
        Class1 x = new Class1(4,5,6);
        Class1 y = new Class1(6,7,8);
        Class1 z = new Class1(9,7,7);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}