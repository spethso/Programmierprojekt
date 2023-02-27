package de.phl.programmingproject.petadoption;

import java.util.Date;

public class Adoption {
    
    private final Pet pet;
    private final Adopter adopter;
    private final Date date;

    public Adoption(final Pet pet, final Adopter adopter, final Date date) {
        if (pet == null || adopter == null || date == null) {
            throw new IllegalArgumentException("Pet, adopter and date must not be null");
        }
        this.pet = pet;
        this.adopter = adopter;
        this.date = date;
    }

    public String getInfo() {
        return String.format("Pet: %s, Adopter: %s, Date: %s", pet.getInfo(), adopter.getInfo(), date);
    }
}
