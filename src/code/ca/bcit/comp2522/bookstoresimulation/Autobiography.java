package ca.bcit.comp2522.bookstoresimulation;

/**
 * Models an Autobiography, a type of Biography.
 *
 * @author Mischa Potter
 * @author Kenny Fok
 * 
 * @version 1.0
 */
public class Autobiography
        extends Biography
            implements Printable
{
    final Author author;

    /**
     * Constructs an Autobiography with the title, year published, author, and subject.
     *
     * @param title         the title of this biography
     * @param yearPublished the year this biography was published
     * @param author        the author of this biography
     * @param subject       the subject of this biography
     */
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author,
                         final Person subject)
    {
        super(title, yearPublished, author, subject);

        validateAuthor(author);

        this.author = author;
    }

    /*
     * Validates the author.
     *
     * @param author the author to validate
     *
     * @throws IllegalArgumentException if the author is invalid
     */
    private static void validateAuthor(final Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Invalid author: " + author);
        }
    }

    /**
     * Prints out the Autobiography's details.
     */
    @Override
    public void display()
    {
        super.display();
        author.display();
    }
}
