package ca.bcit.comp2522.bookstoresimulation;

/**
 * E
 *
 * @author Mischa Potter
 * @author Kenny Fok
 *
 * @version 1.0
 */
public class Book implements Comparable<Book>, Printable, Reversible
{
    private static final int MAX_TITLE_LENGTH = 100;
    private static final int MIN_YEAR_PUBLISHED = 1;
    private static final int CURRENT_YEAR = 2026;

    private final String title;
    private final int yearPublished;
    private final Author author;

    /**
     * Constructor for Book class that initializes the title, year published, and author.
     *
     * @param title         the title of the book
     * @param yearPublished the year the book was published
     * @param author        the author of the book
     */
    public Book(final String title, final int yearPublished, final Author author)
    {
        validateTitle(title);
        validateYearPublished(yearPublished);
        validateAuthor(author);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    /*
     * Validates that the title is not null or empty and less than max title length.
     *
     * @param title the title to validate
     *
     * @throws IllegalArgumentException if the title is null or empty or exceeds max title length.
     */
    private static void validateTitle(final String title)
    {
        if (title == null || title.isEmpty())
        {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (title.length() > MAX_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Title cannot exceed " + MAX_TITLE_LENGTH + " characters.");
        }
    }

    /*
     * Validates that the year published is between min year and current year.
     *
     * @param yearPublished the year published to validate
     *
     * @throws IllegalArgumentException if the year published is not between min year and current year.
     */
    private static void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR_PUBLISHED || yearPublished > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Year published must be between " + MIN_YEAR_PUBLISHED + " and " + CURRENT_YEAR + ".");
        }
    }

    /*
     * Validates that the author is not null.
     *
     * @param author the author to validate
     *
     * @throws IllegalArgumentException if the author is null
     */
    private static void validateAuthor(final Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Author cannot be null.");
        }
    }

    /**
     * Compares this book to another book based on the title, older books are larger.
     *
     * @param other the other book to compare to
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
        System.out.println("Title: " + title + "\n" +
        "Year Published: " + yearPublished + "\n" +
        "Author: " + author);
    }

    /**
     * Prints the title of the book backwards.
     */
    @Override
    public void backwards()
    {
        StringBuilder reversedTitle;
        reversedTitle = new StringBuilder(title);
        reversedTitle.reverse();
        System.out.println("The title backwards is: " + reversedTitle.toString());
    }
}