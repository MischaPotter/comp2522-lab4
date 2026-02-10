package ca.bcit.comp2522.bookstoresimulation;

import java.lang.reflect.Type;

/**
 * Models a Person that has a date of birth/death and a name.
 *
 * @author Mischa Potter
 * @author Kenny Fok
 * @version 1.0
 */
public class Person implements Comparable<Object>, Printable, Reversible
{
    public static final int OLDER_COMPARE_RESULT    = 100;
    public static final int YOUNGER_COMPARE_RESULT  = -100;
    public static final int SAME_AGE_COMPARE_RESULT = 0;

    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

    /**
     * Constructor for Person class that initializes the date of birth/death and their name.
     *
     * @param dateOfBirth the date of birth of the person
     * @param dateOfDeath the date of death of the person
     */
    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name)
    {
        validateDateOfBirth(dateOfBirth);
        validateDateOfDeath(dateOfDeath, dateOfBirth);
        validateName(name);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
    }

    /*
     * Validates the name.
     *
     * @param name the name to validate
     *
     * @throws IllegalArgumentException if the name isn't valid
     */
    private static void validateName(final Name name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
    }

    /*
     * Validates the date of birth.
     *
     * @param dateOfBirth the date of birth to validate
     *
     * @throws IllegalArgumentException if the date is invalid
     */
    private static void validateDateOfBirth(final Date dateOfBirth)
    {
        if (dateOfBirth == null)
        {
            throw new IllegalArgumentException("Invalid date of birth: " + dateOfBirth);
        }
    }

    /*
     * Validates the date of death.
     *
     * @param dateOfDeath the date of death to validate
     *
     * @throws IllegalArgumentException if the date of death is invalid
     */
    private static void validateDateOfDeath(final Date dateOfDeath,
                                            final Date dateOfBirth)
    {
        if (dateOfDeath == null)
        {
            //??
        }
        else if (dateOfDeath.isBefore(dateOfBirth))
        {
            throw new IllegalArgumentException("Invalid date of death: " + dateOfDeath);
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
     * Getter for date of death.
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
     * positive if this person is older than that person,
     * otherwise they are the same age
     */
    @Override
    public int compareTo(final Object that)
    {
        if (!(that instanceof Person))
        {
            throw new IllegalArgumentException("Not a Person");
        }

        final Person p;
        p = (Person) that;

        {
            if (this.dateOfBirth.isBefore(p.dateOfBirth))
            {
                return YOUNGER_COMPARE_RESULT;
            }
            else if (p.dateOfBirth.isBefore(this.dateOfBirth))
            {
                return OLDER_COMPARE_RESULT;
            }
            else
            {
                return SAME_AGE_COMPARE_RESULT;
            }
        }
    }

    /**
     * Method from Printable interface that prints the date of birth
     * and date of death in a sentence.
     */
    @Override
    public void display()
    {
        final StringBuilder builder;
        builder = new StringBuilder();
        builder.append("The person was born on ");
        builder.append(dateOfBirth.getMonthName());
        builder.append(" ");
        builder.append(dateOfBirth.getDay());
        builder.append(", ");
        builder.append(dateOfBirth.getYear());
        if (dateOfDeath == null)
        {
            builder.append(" and is still alive.");
        }
        else
        {
            builder.append(" and died on ");
            builder.append(dateOfDeath.getMonthName());
            builder.append(" ");
            builder.append(dateOfDeath.getDay());
            builder.append(", ");
            builder.append(dateOfDeath.getYear());
            builder.append(".");
        }
        System.out.println(builder);
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

