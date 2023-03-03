package main.java.de.phl.programmingproject.animals;

public class Mammal extends Animal {

    private final String breed;

    public Mammal(final String name, final String breed) {
        super(name);
        if (breed == null || breed.isEmpty()) {
            throw new IllegalArgumentException("Breed must not be null or empty.");
        }
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.format("I am %s and I am a %s.%n", getName(), breed);
    }

    public String getBreed() {
        return breed;
    }
}
