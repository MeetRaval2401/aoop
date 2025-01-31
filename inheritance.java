/ Parent class (Super class)
class Animal {
    // Method in the parent class
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (Subclass) inherits from Animal
class Dog extends Animal {
    // Method in the child class
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the child class (Dog)
        Dog dog = new Dog();

        // Calling method from parent class
        dog.makeSound();  // Inherited from Animal class

        // Calling method from child class
        dog.bark();  // Defined in Dog class
    }
}
