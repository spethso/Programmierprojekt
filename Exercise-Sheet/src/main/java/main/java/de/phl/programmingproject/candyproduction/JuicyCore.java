package main.java.de.phl.programmingproject.candyproduction;

public class JuicyCore {

    private final String flavor;

    /**
     * Creates a new juicy core.
     *
     * @param flavor The flavor of the juicy core.
     * @throws IllegalArgumentException if the flavor is null or empty.
     */
    public JuicyCore(String flavor) {
        if (flavor == null || flavor.isEmpty()) {
            throw new IllegalArgumentException("Flavor is null or empty.");
        }
        this.flavor = flavor;
    }
    
    public String getFlavor() {
        return flavor;
    }
}
