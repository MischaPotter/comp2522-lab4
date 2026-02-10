package ca.bcit.comp2522.bookstoresimulation;

/**
 * Models an Author, a type of Person.
 *
 * @author Mischa Potter
 * @author Kenny Fok
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
    public Author(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, dateOfDeath, name);

        validateGenre(genre);

        this.genre = genre;
    }

    /*
     * Validates the genre.
     *
     * @param genre the genre to validate
     *
     * @throws IllegalArgumentException if the genre is invalid
     */
    private static void validateGenre(final String genre)
    {
        if (genre == null || genre.isEmpty() || genre.length() > MAX_GENRE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid genre: " + genre);
        }
    }

    /**
     * Prints the details of the author, including name, genre, date of birth, and date of death.
     */
    @Override
    public void display()
    {
        final StringBuilder builder;
        builder = new StringBuilder();
        builder.append("Author: ");
        builder.append(getName().getFirstName());
        builder.append(" ");
        builder.append(getName().getLastName());
        builder.append("\nGenre: ");
        builder.append(genre);
        builder.append("\nDate of Birth: ");
        builder.append(getDateOfBirth());
        builder.append("\nDate of Death: ");
        builder.append(getDateOfDeath());

        System.out.println(builder);
    }


}
