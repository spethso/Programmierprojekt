package de.phl.programmingproject.petadoption;

public class Pet {

    private final String name;
    private final String breed;
    private int age;
    private boolean adopted;

    /**
     * Creates a new pet with the given name, age and breed.
     * @param name The name of the pet.
     * @param age The age of the pet.
     * @param breed The breed of the pet.
     * @throws IllegalArgumentException If the name is null or empty, the age is negative or the breed is null or empty.
     */
    public Pet(final String name, final int age, final String breed) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be negative");
        }
        if (breed == null || breed.isEmpty()) {
            throw new IllegalArgumentException("Breed must not be null or empty");
        }
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    
    public String getInfo() {
        return String.format("Name: %s, Age: %d, Breed: %s", name, age, breed);
    }

    /**
     * Sets the pet to adopted.
     * @throws IllegalStateException If the pet is already adopted.
     */
    public void adopt() {
        if (this.adopted) {
            throw new IllegalStateException("Pet is already adopted");
        }
        this.adopted = true;
    }

    public boolean isAdopted() {
        return this.adopted;
    }
    
}