package main.java.de.phl.programmingproject.animals;

public class Main {
    public static void main(final String[] args) {
        // Part 1
        System.out.println("===Part 2===");
        final Animal animal = new Animal("Animal");
        animal.speak();
        final Mammal mammal = new Mammal("Mammal", "Mammal breed");
        mammal.speak();
        final Cat cat = new Cat("Cat", "Cat breed");
        cat.speak();
        cat.meow();
        final Mammal cat2 = new Cat("Cat2", "Cat2 breed");
        cat2.speak();
        // cat2.meow(); // This is not possible because the reference is of type Mammal.
        final Dog dog = new Dog("Dog", "Dog breed");
        dog.speak();
        dog.bark();

        // Part 2
        System.out.println("===Part 2===");
        final Zoo zoo = new Zoo();
        zoo.addAnimal(animal);
        zoo.addAnimal(mammal);
        zoo.addAnimal(cat);
        zoo.addAnimal(cat2);
        zoo.addAnimal(dog);
        zoo.displayAnimals();
    }
}
