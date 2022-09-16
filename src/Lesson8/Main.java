package Lesson8;


public class Main {

    public static void main(String[] args) {
        iCanThrowException(null);

    }

    public static void iCanThrowException(String param) {
        try {
            if (param == null) {
            }
            throw new NullPointerException(" :: Parameter 'param' was null inside method 'doSomething'.");
        } catch (NullPointerException e) {
        }
    }
    }



