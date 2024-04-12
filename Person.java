/* Lab Record - 19
 * Write a Java program to create a class called Person with private instance variables name, age, and country.
 * Provide public getter and setter methods to access and modify these variables.
 */

public class Person {
    // Private instance variables
    private String name;
    private int age;
    private String country;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for country
    public String getCountry() {
        return country;
    }

    // Setter method for country
    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();

        // Set the values using setter methods
        person.setName("John");
        person.setAge(30);
        person.setCountry("USA");

        // Get and print the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}
