//Write a program which creates and initializes all primitive data types.
//   _Remark: There are 8 primitive data types.
// Byte //Short // int // long  // char // float //  double // boolean // boolean
public class HomeTask2 {
    public static void main(String[] args) {
        byte sizeByte = 10;
        System.out.println(sizeByte + "min-128  max 127");
        short sizeShort = 10000;
        System.out.println(sizeShort + "min-32768  max 32767");
        int sizeInt = 1000000000;
        System.out.println(sizeInt + "min-2147483648  max 2147483647");
        long sizeLong = 1000000000000000000L;
        System.out.println(sizeLong + "min-9223372036854775808  max 9223372036854775807");
        char sizeChar = 10000;
        System.out.println(sizeChar + "min0  max 65536");
        float sizeFloat = 10.0f;
        System.out.println(sizeFloat + "min -3.40e+38  max 3.4e+38");
        double sizeDouble = 100.0;
        System.out.println(sizeDouble + "min-1.79e+308  max +1,79e+308");
        boolean True = true;
        boolean False = false;
        System.out.println(True);
        System.out.println(False);
    }
}






