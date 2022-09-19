package Lesson7;


public interface Flyable {
     public void fly();
    }

    class Bird implements Flyable{

    public void fly() {
System.out.println("Птица");
        }
    }

    class Duck implements Flyable{


        public void fly() {
            System.out.println("Утка");
        }



        public static void main(String[] args) {
            Bird bird = new Bird();
            Duck duck = new Duck();
            duck.fly();
            bird.fly();
        }
    }