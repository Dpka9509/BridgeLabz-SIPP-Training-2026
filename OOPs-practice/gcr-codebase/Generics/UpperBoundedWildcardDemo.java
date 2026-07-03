import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class UpperBoundedWildcardDemo {

    // Read-only access using ? extends Animal
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound();
        }

        // animals.add(new Dog()); // Compile-time Error
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        printAnimals(dogs);
    }
}