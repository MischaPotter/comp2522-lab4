package ca.bcit.comp2522.bookstoresimulation;

/**
 * E
 *
 * @author Mischa Potter
 * @author Kenny Fok
 *
 * @version 1.0
 */
public class Person implements Comparable<Person>, Printable, Reversible
{
    public static final int OLDER_COMPARE_RESULT= 100;
    public static final int YOUNGER_COMPARE_RESULT = -100;
    public static final int SAME_AGE_COMPARE_RESULT = 0;

    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

    /**
     * Constructor for Person class that initializes the date of birth and date of death.
     *
     * @param dateOfBirth the date of birth of the person
     * @param dateOfDeath the date of death of the person
     */
    public Person(final Date dateOfBirth, final Date dateOfDeath, final Name name)
    {

        validateDateOfBirth(dateOfBirth);
        validateDateOfDeath(dateOfDeath, dateOfBirth);
        validateName(name);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name = name;
    }
    /*
     * Validates that the name is not null.
     *
     * @param name the name to validate
     *
     * @throws IllegalArgumentException if the name is null
     */
    private static void validateName(final Name name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null.");
        }
    }

    /*
     * Validates that the date of birth is not null.
     *
     * @param dateOfBirth the date of birth to validate
     *
     * @throws IllegalArgumentException if the date of birth is null
     */
    private static void validateDateOfBirth(final Date dateOfBirth)
    {
        if (dateOfBirth == null)
        {
            throw new IllegalArgumentException("Date of birth cannot be null.");
        }
    }

    /*
     * Validates that the date of death is not before the date of birth.
     *
     * @param dateOfDeath the date of death to validate
     *
     * @throws IllegalArgumentException if the date of death is before the date of birth
     */
    private static void validateDateOfDeath(final Date dateOfDeath, final Date dateOfBirth)
    {
        if (dateOfDeath.isBefore(dateOfBirth))
        {
            throw new IllegalArgumentException("Date of death cannot be before date of birth.");
        }
    }

    /**
     * Getter for name.
     * 
     * @return name
     */
    public Name getName()
    {
        return name;
    }

    /**
     * Getter for date of birth
     * 
     * @return dateOfBirth
     */
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * Getter for date of death
     * 
     * @return dateOfDeath
     */
    public Date getDateOfDeath()
    {
        return dateOfDeath;
    }

    /**
     * Compares this person to another person based on their date of birth.
     * Older people are "larger".
     * 
     * @return negative if this person is younger than that person,
     *  positive if this person is older than that person, 
     *  otherwise they are the same age
     */
    @Override
    public int compareTo(final Person that)
    {
        if (this.dateOfBirth.isBefore(that.dateOfBirth))
        {
            return YOUNGER_COMPARE_RESULT;
        }
        else if (that.dateOfBirth.isBefore(this.dateOfBirth))
        {
            return OLDER_COMPARE_RESULT;
        }
        else
        {
            return SAME_AGE_COMPARE_RESULT;
        }
    }

    /**
     * Method from Printable interface that prints the date of birth and date of death in a sentence
     */
    @Override
    public void display()
    {
        if (dateOfDeath == null)
        {
            System.out.println("The person was born on " + dateOfBirth.getMonthName() + 
            " " + dateOfBirth.getDay() + ", " + dateOfBirth.getYear() + " and is still alive.");
        }
        else
        {
            System.out.println("The person was born on " + dateOfBirth.getMonthName() + 
            " " + dateOfBirth.getDay() + ", " + dateOfBirth.getYear() + 
            " and died on " + dateOfDeath.getMonthName() + " " + 
            dateOfDeath.getDay() + ", " + dateOfDeath.getYear() + ".");
        }
    }

    /**
     * Method from Reversible interface that returns the full name backwards.
     *
     * @return the full name backwards
     */
    @Override
    public void backwards()
    {
        String fullName;
        StringBuilder reversedName;

        fullName = name.getFirstName() + " " + name.getLastName();    

        reversedName = new StringBuilder(fullName);
        reversedName.reverse();
        
        System.out.println("The full name backwards is: " + reversedName.toString());
    }
}

