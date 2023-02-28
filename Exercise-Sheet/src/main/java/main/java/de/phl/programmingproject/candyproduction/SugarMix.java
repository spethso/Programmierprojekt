package main.java.de.phl.programmingproject.candyproduction;

import java.util.Set;

public class SugarMix {
    private final Set<String> flavors;

    /**
     * Creates a new sugar mix.
     *
     * @param flavors The flavors of the sugar mix.
     * @throws IllegalArgumentException if the flavors is null, empty or contains null.
     */
    public SugarMix(final Set<String> flavors) {
        if (flavors == null || flavors.isEmpty()) {
            throw new IllegalArgumentException("Flavors is null, empty or contains null.");
        }
        this.flavors = flavors;
    }

    public Set<String> getFlavors() {
        return flavors;
    }
}
