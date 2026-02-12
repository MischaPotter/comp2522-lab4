package ca.bcit.comp2522.bookstoresimulation;

/**
 * Models a Biography, a type of Book.
 *
 * @author Mischa Potter
 * @author Kenny Fok
 * 
 * @version 1.0
 */
public class Biography
        extends Book
            implements Printable
{
    private final Person subject;

    /**
     * Constructs a Biography with the title, year published, author, and subject.
     *
     * @param title         the title of this biography
     * @param yearPublished the year this biography was published
     * @param author        the author of this biography
     * @param subject       the subject of this biography
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);

        validateSubject(subject);

        this.subject = subject;
    }

    /*
     * Validates the subject.
     *
     * @param subject the subject to validate
     *
     * @throws IllegalArgumentException if the subject is invalid
     */
    private static void validateSubject(final Person subject)
    {
        if (subject == null)
        {
            throw new IllegalArgumentException("Invalid subject: " + subject);
        }
    }

    /**
     * Prints a Biography's details.
     */
    @Override
    public void display()
    {
        super.display();
        System.out.println();
    }

    /**
     * Defines how two Biographies are equal.
     *
     * @param o the reference object with which to compare
     * @return true if the Biographies are equal
     */
    @Override
    public boolean equals(final Object o)
    {
        if (!(o instanceof Biography))
        {
            return false;
        }

        final Biography b;
        b = (Biography) o;

        return subject.equals(b.subject);
    }

    /**
     * Calculates the hashcode for a Biography.
     *
     * @return the hashcode
     */
    @Override
    public int hashCode()
    {
        return subject.hashCode();
    }
}
