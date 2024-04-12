/* Lab Record - 16
 * Write a Java program to create a class called Shape with a method called getArea().
 * Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
 */

// Shape class
class Shape {
    // Method to get area (abstract, to be overridden by subclasses)
    double getArea() {
        return 0; // Default implementation (to be overridden)
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    double length;
    double width;
    
    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method overriding getArea to calculate area of rectangle
    @Override
    double getArea() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(3, 4);
        
        // Call the getArea method of Rectangle
        double area = rectangle.getArea();
        
        // Print the area of the rectangle
        System.out.println("Area of the rectangle: " + area);
    }
}