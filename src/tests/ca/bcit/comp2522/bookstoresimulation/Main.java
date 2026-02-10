package ca.bcit.comp2522.bookstoresimulation;

/**
 * Demonstrates the use of
 *
 * @author Mischa Potter
 * @author Kenny Fok
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        // Dates for Books' Authors
        final Date georgeOrwellBirthDate;
        final Date georgeOrwellDeathDate;
        final Date harperLeeBirthDate;
        final Date harperLeeDeathDate;
        final Date janeAustenBirthDate;
        final Date janeAustenDeathDate;
        final Date fScottFitzgeraldBirthDate;
        final Date fScottFitzgeraldDeathDate;
        final Date hermanMelvilleBirthDate;
        final Date hermanMelvilleDeathDate;

        // Dates for Biographies' Authors
        final Date robertCaroBirthDate;
        final Date robertCaroDeathDate;
        final Date walterIsaacsonBirthDate;
        final Date walterIsaacsonDeathDate;
        final Date martinGilbertBirthDate;
        final Date martinGilbertDeathDate;
        final Date ronChernowBirthDate;
        final Date ronChernowDeathDate;

        // Dates for Autobiographies' Authors
        final Date anneFrankBirthDate;
        final Date anneFrankDeathDate;
        final Date nelsonMandelaBirthDate;
        final Date nelsonMandelaDeathDate;
        final Date mahatmaGhandiBirthDate;
        final Date mahatmaGhandiDeathDate;
        final Date mayaAngelouBirthDate;
        final Date mayaAngelouDeathDate;
        final Date malcolmXBirthDate;
        final Date malcolmXDeathDate;

        final Book nineteenEightyFour;
        final Book toKillAMockingBird;
        final Book prideAndPrejudice;
        final Book theGreatGatsby;
        final Book mobyDick;

        final Autobiography theDiaryOfAYoungGirl;
        final Autobiography longWalkToFreedom;
        final Autobiography theStoryOfMyExperimentsWithTruth;
        final Autobiography iKnowWhyTheCagedBirdSings;
        final Autobiography autobiographyOfMalcolmX;

        final Author georgeOrwellAuthor;
        final Author harperLeeAuthor;
        final Author janeAustenAuthor;
        final Author fScottFitzgeraldAuthor;
        final Author hermanMelvilleAuthor;

        final Name georgeOrwellName;
        final Name harperLeeName;
        final Name janeAustenName;
        final Name fScottFitzgeraldName;
        final Name hermanMelvilleName;

        georgeOrwellBirthDate     = new Date(1903, 6, 25);
        georgeOrwellDeathDate     = new Date(1950, 1, 21);
        harperLeeBirthDate        = new Date(1926, 4, 28);
        harperLeeDeathDate        = new Date(2016, 2, 19);
        janeAustenBirthDate       = new Date(1775, 12, 16);
        janeAustenDeathDate       = new Date(1817, 7, 18);
        fScottFitzgeraldBirthDate = new Date(1896, 9, 24);
        fScottFitzgeraldDeathDate = new Date(1940, 12, 21);
        hermanMelvilleBirthDate   = new Date(1819, 8, 1);
        hermanMelvilleDeathDate   = new Date(1891, 9, 28);

        // Dates for Biographies' Authors
        robertCaroBirthDate     = new Date(1935, 10, 30);
        robertCaroDeathDate     = null;
        walterIsaacsonBirthDate = new Date(1952, 5, 20);
        walterIsaacsonDeathDate = null;
        martinGilbertBirthDate  = new Date(1936, 10, 25);
        martinGilbertDeathDate  = new Date(2015, 2, 3);
        ronChernowBirthDate     = new Date(1949, 3, 3);
        ronChernowDeathDate     = null;

        // Dates for Autobiographies' Authors
        anneFrankBirthDate     = new Date(1929, 6, 12);
        anneFrankDeathDate     = new Date(1945, 1, 1);
        nelsonMandelaBirthDate = new Date(1918, 7, 18);
        nelsonMandelaDeathDate = new Date(2013, 12, 5);
        mahatmaGhandiBirthDate = new Date(1869, 10, 2);
        mahatmaGhandiDeathDate = new Date(1948, 1, 30);
        mayaAngelouBirthDate   = new Date(1928, 4, 4);
        mayaAngelouDeathDate   = new Date(2014, 5, 28);
        malcolmXBirthDate      = new Date(1925, 5, 19);
        malcolmXDeathDate      = new Date(1965, 2, 21);

        georgeOrwellName     = new Name("George", "Orwell");
        harperLeeName        = new Name("Harper", "Lee");
        janeAustenName       = new Name("Jane", "Austen");
        fScottFitzgeraldName = new Name("F. Scott", "Fitzgerald");
        hermanMelvilleName   = new Name("Herman", "Melville");

        georgeOrwellAuthor     = new Author(georgeOrwellBirthDate, georgeOrwellDeathDate, georgeOrwellName, "Sci-Fi");
        harperLeeAuthor        = new Author(harperLeeBirthDate, harperLeeDeathDate, harperLeeName, "Fiction");
        janeAustenAuthor       = new Author(janeAustenBirthDate, janeAustenDeathDate, janeAustenName, "Fiction");
        fScottFitzgeraldAuthor = new Author(fScottFitzgeraldBirthDate, fScottFitzgeraldDeathDate,
                                            fScottFitzgeraldName, "Fiction");
        hermanMelvilleAuthor   = new Author(hermanMelvilleBirthDate, hermanMelvilleDeathDate, hermanMelvilleName, "");

        nineteenEightyFour = new Book("Nineteen Eighty Four", 1949, georgeOrwellAuthor);
        toKillAMockingBird = new Book("To Kill A Mocking Bird", 1960, harperLeeAuthor);
        prideAndPrejudice  = new Book("Pride and Prejudice", 1813, janeAustenAuthor);
        theGreatGatsby     = new Book("The Great Gatsby", 1915, );
        mobyDick           = new Book();

        theDiaryOfAYoungGirl             = new Autobiography();
        longWalkToFreedom                = new Autobiography();
        theStoryOfMyExperimentsWithTruth = new Autobiography();
        iKnowWhyTheCagedBirdSings        = new Autobiography();
        autobiographyOfMalcolmX          = new Autobiography();


        /**
         *     public Person(final Date dateOfBirth,
         *                   final Date dateOfDeath,
         *                   final Name name)
         */
    }
}
