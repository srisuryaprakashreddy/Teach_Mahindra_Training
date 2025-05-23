package Day3;

//Base Class
class Shape {
 protected String color;

 // Default constructor
 public Shape() {
     this.color = "undefined";
     System.out.println("Shape constructor called");
 }

 // Overloaded constructor
 public Shape(String color) {
     this.color = color;
     System.out.println("Shape constructor with color called");
 }

 // Overloaded method: area with no arguments
 public double area() {
     return 0.0;
 }

 // Overloaded method: area with one double parameter (demo purpose)
 public double area(double side) {
     return side * side;
 }

 // Overloaded method: area with two parameters
 public double area(double length, double width) {
     return length * width;
 }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color); // Constructor chaining to Shape(String)
        this.radius = radius;
        System.out.println("Circle constructor called");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width, String color) {
        super(color); // Constructor chaining
        this.length = length;
        this.width = width;
        System.out.println("Rectangle constructor called");
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
        System.out.println("Triangle constructor called");
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}



public class Area_polymorphism {
    public static void main(String[] args) {
        // Method overloading in base class
        Shape generic = new Shape();
        System.out.println("Square area (overloaded): " + generic.area(5));
        System.out.println("Rectangle area (overloaded): " + generic.area(4, 6));

        // Method overriding and constructor chaining
        Circle c = new Circle(7, "Red");
        System.out.println("Circle area: " + c.area());

        Rectangle r = new Rectangle(4, 8, "Blue");
        System.out.println("Rectangle area: " + r.area());

        Triangle t = new Triangle(5, 6, "Green");
        System.out.println("Triangle area: " + t.area());
    }
}


