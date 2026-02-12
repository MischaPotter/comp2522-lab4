package ca.bcit.comp2522.bookstoresimulation;

/**
 * Models a Name that has a first name and last name.
 *
 * @author Mischa Potter
 * @author Kenny Fok
 * 
 * @version 1.0
 */
public class Name
        implements Printable
{
    private final String firstName;
    private final String lastName;

    /**
     * Constructor for Name class that initializes the first and last name.
     *
     * @param firstName the first name of the person
     * @param lastName  the last name of the person
     */
    public Name(final String firstName,
                final String lastName)
    {
        validateFirstName(firstName);
        validateLastName(lastName);

        this.firstName = firstName;
        this.lastName  = lastName;
    }

    /**
     * Getter for the first name.
     *
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Getter for the last name.
     *
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Method from Printable interface to print the full name.
     */
    @Override
    public void display()
    {
        System.out.println("The full name is: " + firstName + " " + lastName);
    }

    /*
     * Validates the first name.
     *
     * @param name the name to validate
     *
     * @throws IllegalArgumentException if the name is invalid
     */
    private static void validateFirstName(final String firstName)
    {
        if (firstName == null || firstName.isEmpty())
        {
            throw new IllegalArgumentException("Invalid first name: " + firstName);
        }
    }

    /*
     * Validates the last name.
     *
     * @param name the name to validate
     *
     * @throws IllegalArgumentException if the last name is invalid
     */
    private static void validateLastName(final String lastName)
    {
        if (lastName == null || lastName.isEmpty())
        {
            throw new IllegalArgumentException("Invalid last name: " + lastName);
        }
    }

}
