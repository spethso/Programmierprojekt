package main.java.de.phl.programmingproject.candyproduction;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Candy {

    private final SugarMix sugarMix;
    private Optional<JuicyCore> juicyCore;

    /**
     * Creates a new candy with the given sugar mix.
     * @param sugarMix The sugar mix of the candy.
     * @throws IllegalArgumentException if the sugar mix is null.
     */
    public Candy(final SugarMix sugarMix) {
        if (sugarMix == null) {
            throw new IllegalArgumentException("Sugar mix must not be null");
        }
        this.sugarMix = sugarMix;
        this.juicyCore = Optional.empty();
    }

    /**
     * Creates a new candy with the given sugar mix and juicy core.
     * @param sugarMix The sugar mix of the candy.
     * @param juicyCore The juicy core of the candy.
     * @throws IllegalArgumentException if the sugar mix is null.
     * @throws IllegalArgumentException if the juicy core is null.
     */
    public Candy(final SugarMix sugarMix, final JuicyCore juicyCore) {
        // TODO: Implement this operation
        this.sugarMix = null;
        this.juicyCore = null;
    }

    public SugarMix getSugarMix() {
        return sugarMix;
    }

    /**
     * Returns the juicy core of the candy. Throws a NoSuchElementException if the candy has no juicy core.
     *
     * @return The juicy core of the candy.
     * @throws NoSuchElementException if the candy has no juicy core.
     */
    public JuicyCore getJuicyCore() {
        // TODO: Implement this operation
        return null;
    }

    /**
     * Checks if this candy has a juice core.
     *
     * @return True if it has a juice core.
     */
    public boolean hasJuiceCore() {
        return this.juicyCore.isPresent();
    }
}
