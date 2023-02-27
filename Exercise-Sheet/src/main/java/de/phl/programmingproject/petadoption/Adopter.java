package de.phl.programmingproject.petadoption;

public class Adopter {
    
    private final String name;
    private final String phone;
    private final String email;

    /**
     * Creates a new adopter with the given name, phone and email.
     * @param name The name of the adopter.
     * @param phone The phone number of the adopter.
     * @param email The email of the adopter.
     * @throws IllegalArgumentException If the name is null or empty, the phone is null or empty or the email is null or empty.
     */
    public Adopter(final String name, final String phone, final String email) {
        if (name == null || name.isEmpty() || phone == null || phone.isEmpty() || email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Name, phone and email must not be null or empty");
        }
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getInfo() {
        return String.format("Name: %s, Phone: %s, Email: %s", name, phone, email);
    }

}
