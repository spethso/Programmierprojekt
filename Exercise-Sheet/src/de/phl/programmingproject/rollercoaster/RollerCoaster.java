package de.phl.programmingproject.rollercoaster;

public class RollerCoaster {

    /**
     * Checks if the given person is eligible to ride the roller coaster.
     * 
     * Eligible on their own are persons which are at least 12 years old and 1.5
     * meters tall. Persons which are at least 10 years old but 1.3 meters tall are
     * eligible too but require an adult. Persons younger than 10 years old or less
     * than 1.3 meters tall are not eligible at all to ride the roller coaster.
     * 
     * @param person
     *               The person to check.
     * @return True if the person is eligible to ride the roller coaster, false
     *         otherwise.
     */
    public boolean isEligibleToRide(final Person person) {
        // TODO: Implement this operation
        return true;
    }

    public static void main(String[] args) {
        final RollerCoaster rollerCoaster = new RollerCoaster();
        final Person max = new Person(18, 180);
        final Person moritz = new Person(9, 110);
        final Person anna = new Person(12, 145);
        final Person lisa = new Person(10, 135);
        System.out.println(rollerCoaster.isEligibleToRide(max));
        System.out.println(rollerCoaster.isEligibleToRide(moritz));
        System.out.println(rollerCoaster.isEligibleToRide(anna));
        System.out.println(rollerCoaster.isEligibleToRide(lisa));
    }
}
