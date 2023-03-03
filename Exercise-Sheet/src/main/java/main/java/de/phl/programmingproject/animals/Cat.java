package main.java.de.phl.programmingproject.animals;

public class Cat extends Mammal {

    public Cat(String name, String breed) {
        super(name, breed);
    }
    
    @Override
    public void speak() {
        System.out.format("I am %s and I am a %s and I meow.%n", getName(), getBreed());
    }

    public void meow() {
        System.out.println("Meow!");
    }
    
}
