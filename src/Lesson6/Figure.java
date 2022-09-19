package Lesson6;

public  abstract class Figure {
    public double width;
    public double length;

    public abstract double area();

    public abstract double perimeter();


    public static class Rectangle extends Figure {
        private final double width, length; //sides

        public Rectangle() {
            this(1, 1, 44);
        }

        public Rectangle(double width, double length, int i) {
            this.width = width;
            this.length = length;
        }

        @Override
        public double area() {
            return width * length;
        }

        @Override
        public double perimeter() {
            return 2 * (width + length);
        }

    }

    public static class Circle extends Figure {
        private final double radius;
        final double pi = Math.PI;

        public Circle() {
            this(1);
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return pi * Math.pow(radius, 2);
        }

        public double perimeter() {
            return 2 * pi * radius;
        }
    }

    public static class Triangle extends Figure {
        private final double a, b, c;

        public Triangle() {
            this(1, 1, 1);
        }

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double area() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        @Override
        public double perimeter() {
            return a + b + c;
        }

        public static void main(String[] args) {
            double width = 5, length = 7;
        Figure rectangle = new Rectangle(50, 33, 44);
            System.out.println("Rectangle width: " + width + " and length: " + length
                    + "\nResulting area: " + rectangle.area()
                    + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
            double a = 5, b = 3, c = 4;
            Figure triangle = new Triangle(a, b, c);
            System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                    + "\nResulting Area: " + triangle.area()
                    + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
            double radius = 5;
            Figure circle = new Circle(radius);
            System.out.println("Circle radius: " + radius
                    + "\nResulting Area: " + circle.area()
                    + "\nResulting Perimeter: " + circle.perimeter() + "\n");
        }
    }














    public void calculateArea () {

    }
}
