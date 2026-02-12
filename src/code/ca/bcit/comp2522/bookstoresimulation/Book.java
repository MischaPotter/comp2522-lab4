package ca.bcit.comp2522.bookstoresimulation;

/**
 * Models a Book.
 *
 * @author Mischa Potter
 * @author Kenny Fok
 * 
 * @version 1.0
 */
public class Book
        implements Comparable<Book>,
                    Printable,
                    Reversible
{
    private static final int MAX_TITLE_LENGTH   = 100;
    private static final int MIN_YEAR_PUBLISHED = 1;
    private static final int CURRENT_YEAR       = 2026;
    private static  final int MAX_YEAR_PUBLISHED = CURRENT_YEAR;

    private final String title;
    private final int    yearPublished;
    private final Author author;

    /**
     * Constructor for Book class that initializes the title, year published, and author.
     *
     * @param title         the title of the book
     * @param yearPublished the year the book was published
     * @param author        the author of the book
     */
    public Book(final String title,
                final int yearPublished,
                final Author author)
    {
        validateTitle(title);
        validateYearPublished(yearPublished);
        validateAuthor(author);

        this.title         = title;
        this.yearPublished = yearPublished;
        this.author        = author;
    }

    /*
     * Validates the title.
     *
     * @param title the title to validate
     *
     * @throws IllegalArgumentException if the title is invalid
     */
    private static void validateTitle(final String title)
    {
        if (title == null || title.isEmpty() || title.length() > MAX_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid title: " + title);
        }
    }

    /*
     * Validates the year published.
     *
     * @param yearPublished the year published to validate
     *
     * @throws IllegalArgumentException if the year is invalid
     */
    private static void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR_PUBLISHED || yearPublished > MAX_YEAR_PUBLISHED)
        {
            throw new IllegalArgumentException("Invalid year: " + yearPublished);
        }
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
     * Compares this book to another book based on the title, older books are larger.
     *
     * @param that the other book to compare to
     * @return a negative integer, zero, or a positive integer based on result.
     */
    @Override
    public int compareTo(final Book that)
    {
        return this.yearPublished - that.yearPublished;
    }

    /**
     * Prints the details of the book, including title, year published, and author.
     */
    @Override
    public void display()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append("Title: ");
        builder.append(title);
        builder.append("\nYear Published: ");
        builder.append(yearPublished);
        builder.append("\nAuthor: ");
        builder.append(author);
        System.out.println(builder);
    }

    /**
     * Prints the title of the book backwards.
     */
    @Override
    public void backwards()
    {
        final StringBuilder reversedTitle;
        reversedTitle = new StringBuilder(title);
        reversedTitle.reverse();
        System.out.println("The title backwards is: " + reversedTitle.toString());
    }
}