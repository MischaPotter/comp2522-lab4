package ca.bcit.comp2522.bookstoresimulation;

/**
 * E
 *
 * @author Mischa Potter
 * @author Kenny Fok
 *
 * @version 1.0
 */
public class Author extends Person implements Printable
{
    private static final int MAX_GENRE_LENGTH = 30;
    private final String genre;

    /**
     * Constructor for Author class that initializes the date of birth, date of death, name, and genre.
     *
     * @param dateOfBirth the date of birth of the author
     * @param dateOfDeath the date of death of the author
     * @param name        the name of the author
     * @param genre       the genre of the author's work
     */
    public Author(final Date dateOfBirth, final Date dateOfDeath, final Name name, final String genre)
    {
        super(dateOfBirth, dateOfDeath, name);

        validateGenre(genre);

        this.genre = genre;
    }

    /*
     * Validates that the genre is not null or empty and less max genre length.
     *
     * @param genre the genre to validate
     *
     * @throws IllegalArgumentException if the genre is null or empty or exceeds max genre length.
     */
    private static void validateGenre(final String genre)
    {
        if (genre == null || genre.isEmpty())
        {
            throw new IllegalArgumentException("Genre cannot be null or empty.");
        }
        if (genre.length() > MAX_GENRE_LENGTH)
        {
            throw new IllegalArgumentException("Genre cannot exceed " + MAX_GENRE_LENGTH + " characters.");
        }
    }

    /**
     * Prints the details of the author, including name, genre, date of birth, and date of death.
     */
    @Override
    public void display()
    {
        System.out.println("Author: " + getName().getFirstName() + " " + getName().getLastName() + "\n" +
        "Genre: " + genre + "\n" +
        "Date of Birth: " + getDateOfBirth() + "\n" +
        "Date of Death: " + getDateOfDeath());
    }


}
