//What is the different between static and non-static field of a class?
//Create an example to demonstrate this concept.
package Lesson5;

class Helper {

    // Non-static method
    public int sum(int a, int b)
    {
        // Returning sum of numbers
        return a + b;
    }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Input integers to be summed up
        int n = 3;
        int m = 6;

        // Creating object of above class
        Helper g = new Helper();

        // Calling above method to compute sum
        int s = g.sum(n, m);

        // Calling the non-static method
        System.out.print("sum is = " + s);
    }
    public static int sum(int a, int b)
    {
        // Simply returning the sum
        return a + b;
    }
}

// Class 2
class GFG1 {

    // Main driver method
    public static void main(String[] args)
    {
        // Custom values for integer
        // to be summed up
        int n = 3, m = 6;

        // Calling the static method of above class
        // and storing sum in integer variable
        int s = GFG.sum(n, m);

        // Print and display the sum
        System.out.print("sum is = " + s);
    }
}




