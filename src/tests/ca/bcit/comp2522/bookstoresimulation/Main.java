package ca.bcit.comp2522.bookstoresimulation;

/**
 * Demonstrates the use of Date, Name, Author, Person, Book, Biography, and Autobiography classes.
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

        // Dates for Subjects
        final Date robertMosesBirthDate;
        final Date robertMosesDeathDate;
        final Date steveJobsBirthDate;
        final Date steveJobsDeathDate;
        final Date winstonChurchillBirthDate;
        final Date winstonChurchillDeathDate;
        final Date alexanderHamiltonBirthDate;
        final Date alexanderHamiltonDeathDate;
        final Date albertEinsteinBirthDate;
        final Date albertEinsteinDeathDate;

        final Author georgeOrwellAuthor;
        final Author harperLeeAuthor;
        final Author janeAustenAuthor;
        final Author fScottFitzgeraldAuthor;
        final Author hermanMelvilleAuthor;

        final Author robertCaroAuthor;
        final Author walterIsaacsonAuthor;
        final Author martinGilbertAuthor;
        final Author ronChernowAuthor;

        final Author anneFrankAuthor;
        final Author nelsonMandelaAuthor;
        final Author mahatmaGhandiAuthor;
        final Author mayaAngelouAuthor;
        final Author malcolmXAuthor;

        // Author Book Names
        final Name georgeOrwellName;
        final Name harperLeeName;
        final Name janeAustenName;
        final Name fScottFitzgeraldName;
        final Name hermanMelvilleName;

        // Subject Names
        final Name robertMosesName;
        final Name steveJobsName;
        final Name winstonChurchillName;
        final Name alexanderHamiltonName;
        final Name albertEinsteinName;

        // Author Biography Names
        final Name robertCaroName;
        final Name walterIsaacsonName;
        final Name martinGilbertName;
        final Name ronChernowName;

        // Author Autobiography Names
        final Name anneFrankName;
        final Name nelsonMandelaName;
        final Name mahatmaGandhiName;
        final Name mayaAngelouName;
        final Name malcolmXName;

        // Subject Persons
        final Person robertMosesPerson;
        final Person steveJobsPerson;
        final Person winstonChurchillPerson;
        final Person alexanderHamiltonPerson;
        final Person albertEinsteinPerson;

        // Subjects for Autobiographies
        final Person anneFrankPerson;
        final Person nelsonMandelaPerson;
        final Person mahatmaGandiPerson;
        final Person mayaAngelouPerson;
        final Person malcolmXPerson;

        // Books
        final Book nineteenEightyFour;
        final Book toKillAMockingBird;
        final Book prideAndPrejudice;
        final Book theGreatGatsby;
        final Book mobyDick;

        // Biographies
        final Biography thePowerBroker;
        final Biography steveJobs;
        final Biography churchillALife;
        final Biography alexanderHamilton;
        final Biography einsteinHisLifeAndUniverse;

        // Autobiographies
        final Autobiography theDiaryOfAYoungGirl;
        final Autobiography longWalkToFreedom;
        final Autobiography theStoryOfMyExperimentsWithTruth;
        final Autobiography iKnowWhyTheCagedBirdSings;
        final Autobiography autobiographyOfMalcolmX;

        georgeOrwellBirthDate     = new Date(1903, 6, 25);
        georgeOrwellDeathDate     = new Date(1950, 1, 21);
        harperLeeBirthDate        = new Date(1926, 4, 28);
        harperLeeDeathDate        = new Date(2016, 2, 19);
        janeAustenBirthDate       = new Date(1800, 12, 16);
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

        // Dates for Subjects initialization
        robertMosesBirthDate       = new Date(1888, 12, 18);
        robertMosesDeathDate       = new Date(1981, 7, 29);
        steveJobsBirthDate         = new Date(1955, 2, 24);
        steveJobsDeathDate         = new Date(2011, 10, 5);
        winstonChurchillBirthDate  = new Date(1874, 11, 30);
        winstonChurchillDeathDate  = new Date(1965, 1, 24);
        alexanderHamiltonBirthDate = new Date(1800, 1, 11);
        alexanderHamiltonDeathDate = new Date(1804, 7, 12);
        albertEinsteinBirthDate    = new Date(1879, 3, 14);
        albertEinsteinDeathDate    = new Date(1955, 4, 18);

        robertMosesName       = new Name("Robert", "Moses");
        steveJobsName         = new Name("Steve", "Jobs");
        winstonChurchillName  = new Name("Winston", "Churchill");
        alexanderHamiltonName = new Name("Alexander", "Hamilton");
        albertEinsteinName    = new Name("Albert", "Einstein");

        robertMosesPerson       = new Person(robertMosesBirthDate, robertMosesDeathDate, robertMosesName);
        steveJobsPerson         = new Person(steveJobsBirthDate, steveJobsDeathDate, steveJobsName);
        winstonChurchillPerson  = new Person(winstonChurchillBirthDate, winstonChurchillDeathDate,
                                             winstonChurchillName);
        alexanderHamiltonPerson = new Person(alexanderHamiltonBirthDate, alexanderHamiltonDeathDate,
                                             alexanderHamiltonName);
        albertEinsteinPerson    = new Person(albertEinsteinBirthDate, albertEinsteinDeathDate, albertEinsteinName);

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
        hermanMelvilleAuthor   = new Author(hermanMelvilleBirthDate, hermanMelvilleDeathDate, hermanMelvilleName,
                                            "Fiction");

        nineteenEightyFour = new Book("Nineteen Eighty Four", 1949, georgeOrwellAuthor);
        toKillAMockingBird = new Book("To Kill A Mocking Bird", 1960, harperLeeAuthor);
        prideAndPrejudice  = new Book("Pride and Prejudice", 1813, janeAustenAuthor);
        theGreatGatsby     = new Book("The Great Gatsby", 1915, fScottFitzgeraldAuthor);
        mobyDick           = new Book("Moby Dick", 1851, hermanMelvilleAuthor);

        anneFrankName     = new Name("Anne", "Frank");
        nelsonMandelaName = new Name("Nelson", "Mandela");
        mahatmaGandhiName = new Name("Mahatma", "Gandhi");
        mayaAngelouName   = new Name("Maya", "Angelou");
        malcolmXName      = new Name("Malcolm", "X");

        anneFrankAuthor     = new Author(anneFrankBirthDate, anneFrankDeathDate, anneFrankName, "Fiction");
        nelsonMandelaAuthor = new Author(nelsonMandelaBirthDate, nelsonMandelaDeathDate, nelsonMandelaName, "Fiction");
        mahatmaGhandiAuthor = new Author(mahatmaGhandiBirthDate, mahatmaGhandiDeathDate, mahatmaGandhiName, "Fiction");
        mayaAngelouAuthor   = new Author(mayaAngelouBirthDate, mayaAngelouDeathDate, mayaAngelouName, "Fiction");
        malcolmXAuthor      = new Author(malcolmXBirthDate, malcolmXDeathDate, malcolmXName, "Fiction");

        anneFrankPerson     = new Person(anneFrankBirthDate, anneFrankDeathDate, anneFrankName);
        nelsonMandelaPerson = new Person(nelsonMandelaBirthDate, nelsonMandelaDeathDate, nelsonMandelaName);
        mahatmaGandiPerson  = new Person(mahatmaGhandiBirthDate, mahatmaGhandiDeathDate, mahatmaGandhiName);
        mayaAngelouPerson   = new Person(mayaAngelouBirthDate, mayaAngelouDeathDate, mayaAngelouName);
        malcolmXPerson      = new Person(malcolmXBirthDate, malcolmXDeathDate, malcolmXName);

        theDiaryOfAYoungGirl             = new Autobiography("The Diary of a Young Girl", 1947, anneFrankAuthor,
                                                             anneFrankPerson);
        longWalkToFreedom                = new Autobiography("Long Walk to Freedom", 1994, nelsonMandelaAuthor,
                                                             nelsonMandelaPerson);
        theStoryOfMyExperimentsWithTruth = new Autobiography("The Story of my Experiment With Truth", 1927,
                                                             mahatmaGhandiAuthor, mahatmaGandiPerson);
        iKnowWhyTheCagedBirdSings        = new Autobiography("I Know Why The Caged Bird Sings", 1969,
                                                             mayaAngelouAuthor, mayaAngelouPerson);
        autobiographyOfMalcolmX          = new Autobiography("Autobiography of Malcolm X", 1965, malcolmXAuthor,
                                                             malcolmXPerson);

        robertCaroName     = new Name("Robert", "Caro");
        walterIsaacsonName = new Name("Walter", "Isaacson");
        martinGilbertName  = new Name("Martin", "Gilbert");
        ronChernowName     = new Name("Ron", "Chernow");

        robertCaroAuthor     = new Author(robertCaroBirthDate, robertCaroDeathDate, robertCaroName, "Fiction");
        walterIsaacsonAuthor = new Author(walterIsaacsonBirthDate, walterIsaacsonDeathDate, walterIsaacsonName,
                                          "Fiction");
        martinGilbertAuthor  = new Author(martinGilbertBirthDate, martinGilbertDeathDate, martinGilbertName, "Fiction");
        ronChernowAuthor     = new Author(ronChernowBirthDate, ronChernowDeathDate, ronChernowName, "Fiction");

        thePowerBroker             = new Biography("The Power Broker", 1974, robertCaroAuthor, robertMosesPerson);
        steveJobs                  = new Biography("Steve Jobs", 2011, walterIsaacsonAuthor, steveJobsPerson);
        churchillALife             = new Biography("Churchill: A Life", 1991, martinGilbertAuthor,
                                                   winstonChurchillPerson);
        alexanderHamilton          = new Biography("Alexander Hamilton", 2004, ronChernowAuthor,
                                                   alexanderHamiltonPerson);
        einsteinHisLifeAndUniverse = new Biography("Einstein: His Life and Universe", 2007, walterIsaacsonAuthor,
                                                   albertEinsteinPerson);

        System.out.println("Book Equality Test");

        if (!nineteenEightyFour.equals(toKillAMockingBird))
        {
            System.out.println("CORRECT: 1984 is not equal to To Kill A Mockingbird");
        }
        else
        {
            System.out.println("INCORRECT: 1984 should not be equal to To Kill A Mockingbird");
        }
        System.out.println(nineteenEightyFour.compareTo(toKillAMockingBird));

        System.out.println("Biography Equality Test");
        if (!thePowerBroker.equals(steveJobs))
        {
            System.out.println("CORRECT: The Power Broker is not equal to Steve Jobs");
        }
        else
        {
            System.out.println("INCORRECT: The Power Broker should not be equal to Steve Jobs");
        }
        System.out.println(thePowerBroker.compareTo(steveJobs));

        System.out.println("Autobiography Equality Test");
        if (!theDiaryOfAYoungGirl.equals(longWalkToFreedom))
        {
            System.out.println("CORRECT: The Diary of A Young Girl is not equal to Long Walk to Freedom");
        }
        else
        {
            System.out.println("INCORRECT: The Diary of A Young Girl should not be equal to Long Walk to Freedom");
        }
        System.out.println(theDiaryOfAYoungGirl.compareTo(longWalkToFreedom));


    }
}
