/* Lab Record - 24
 * Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
 * Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific
 * sound for each animal.
 */

// Base class Animal
class Animal {
    // Method to make sound
    public void Sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass Bird
class Bird extends Animal {
    // Override Sound method for Bird
    @Override
    public void Sound() {
        System.out.println("Bird chirps.");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Override Sound method for Cat
    @Override
    public void Sound() {
        System.out.println("Cat meows.");
    }
}

// Main class to test Animal, Bird, and Cat
public class AnimalSoundTest {
    public static void main(String[] args) {
        // Create objects of Animal, Bird, and Cat
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        
        // Call Sound method for each object
        animal.Sound(); // Output: Animal makes a sound.
        bird.Sound();   // Output: Bird chirps.
        cat.Sound();    // Output: Cat meows.
    }
}
/* Explanation:
 * - Animal class is the base class representing the general behavior of animals with a method Sound().
 * - Bird and Cat are subclasses of Animal, each overriding the Sound() method to specify the sound they make.
 * - In the main class AnimalSoundTest, objects of Animal, Bird, and Cat are created and their Sound() methods are called to demonstrate polymorphism.
 */
