package main.java.de.phl.programmingproject.candyproduction;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CandyFactory {
    
    private final List<String> sugarMixFlavors;
    private final List<String> juicyCoreFlavors;

    /**
     * Creates a new candy factory.
     */
    public CandyFactory() {
        sugarMixFlavors = new LinkedList<>();
        juicyCoreFlavors = new LinkedList<>();
    }

    /**
     * Adds a list of sugar mix flavors.
     *
     * @param sugarMixFlavors The list of sugar mix flavors.
     * @throws IllegalArgumentException if the list is null, empty or contains null.
     */
    public void addSugarMixFlavors(final List<String> sugarMixFlavors) {
        if (sugarMixFlavors == null || sugarMixFlavors.isEmpty() || sugarMixFlavors.contains(null)) {
            throw new IllegalArgumentException("Flavors is null, empty or contains null.");
        }
        this.sugarMixFlavors.addAll(sugarMixFlavors);
    }

    /**
     * Adds a list of juicy core flavors.
     *
     * @param juicyCoreFlavors The list of juicy core flavors.
     * @throws IllegalArgumentException if the list is null, empty or contains null.
     */
    public void addJuicyCoreFlavors(final List<String> juicyCoreFlavors) {
        if (juicyCoreFlavors == null || juicyCoreFlavors.isEmpty() || juicyCoreFlavors.contains(null)) {
            throw new IllegalArgumentException("Flavors is null, empty or contains null.");
        }
        this.juicyCoreFlavors.addAll(juicyCoreFlavors);
    }

    /**
     * Produces a given amount of candies.
     *
     * @param amount The amount of candies to produce.
     * @return The candies.
     * @throws IllegalArgumentException if the amount is less than 1.
     */
    public Set<Candy> produceCandies(final int amount) {
        // TODO: Implement this operation
        return null;
    }
}
