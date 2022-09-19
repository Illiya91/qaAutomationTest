package Lesson4;
//Create a simple class with any 3 fields.
//Demonstrate in your class how we can use "this" keyword to refer to the object,
//from which a constructor or a method was invoked
public class HomeTask6 {
    int age;
    String name;
    int yearBirthday;
HomeTask6(){
}

    void changeNameObject(int a, String b, int c){
        this.age = a;
        this.name = b;
        this.yearBirthday = c;

    }
}

