package Lesson5;

import Lesson5.Class.HomeTask5Class2;

//Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
//Create a third class with the main method.
//In the main method create two different objects of your classes specifying the full name of the classes (including packages).
public class HomeTask5Class1 {

    public static class comDomainnameModulename {


        public comDomainnameModulename(int a, int b) {
        }
    }
public class name{}
 int DomainName(int a, int b){
 return  a + b;
 }

 public static void main(String[] args) {
        comDomainnameModulename domainnameModulename = new comDomainnameModulename(5,5);
        HomeTask5Class2.comDomainnameModulename domainnameModulename1 = new HomeTask5Class2.comDomainnameModulename(10,6);
    System.out.println(domainnameModulename);
        System.out.println(HomeTask5Class2.comDomainnameModulename);
    }
}


