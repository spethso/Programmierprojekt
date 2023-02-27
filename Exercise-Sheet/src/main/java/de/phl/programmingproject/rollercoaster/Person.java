package de.phl.programmingproject.rollercoaster;

public class Person {
    private final int age;
    private final int height;

    /**
     * Creates a new person.
     *
     * @param age The age of the person.
     * @param height The height of the person.
     * @throws IllegalArgumentException if the age or height is negative.
     */
    public Person(final int age, final int height) {
        if (age < 0 || height < 0) {
            throw new IllegalArgumentException("Age and height must be positive!");
        }
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
