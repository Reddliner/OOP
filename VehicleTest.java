/* Lab Record - 15
 * Write a Java program to create a class called Vehicle with a method called drive().
 * Create a subclass called Car that overrides the drive() method to print "Driving a car".
 */

// Vehicle class
class Vehicle {
    // Method to drive
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    // Method overriding drive to drive car
    @Override
    void drive() {
        System.out.println("Driving a car");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        
        // Call the drive method of Vehicle
        vehicle.drive();
        
        // Create an instance of Car
        Car car = new Car();
        
        // Call the drive method of Car
        car.drive();
    }
}
