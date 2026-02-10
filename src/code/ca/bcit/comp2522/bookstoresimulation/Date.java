package ca.bcit.comp2522.bookstoresimulation;

/**
 * Date has a year, month, and day in the format of YYYYMMDD.
 *
 * @author Mischa Potter
 * @author Kenny Fok
 * @version 1.0
 */
public class Date implements Printable
{
    // date mins and max's
    private static final int MIN_YEAR            = 1800;
    private static final int CURRENT_YEAR        = 2026;
    private static final int MIN_MONTH           = 1;
    private static final int MAX_MONTH           = 12;
    private static final int MIN_DAY             = 1;
    private static final int MAX_DAY_TWENTY_NINE = 29;
    private static final int MAX_DAY_THIRTY      = 30;
    private static final int MAX_DAY_THIRTY_ONE  = 31;

    // months
    private static final int JAN  = 1;
    private static final int FEB  = 2;
    private static final int MAR  = 3;
    private static final int APR  = 4;
    private static final int MAY  = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUG  = 8;
    private static final int SEP  = 9;
    private static final int OCT  = 10;
    private static final int NOV  = 11;
    private static final int DEC  = 12;

    // month codes constants
    private static final int JAN_OCT_CODE     = 1;
    private static final int FEB_MAR_NOV_CODE = 4;
    private static final int APR_JULY_CODE    = 0;
    private static final int MAY_CODE         = 2;
    private static final int JUNE_CODE        = 5;
    private static final int AUG_CODE         = 3;
    private static final int SEP_DEC_CODE     = 6;

    // weekdays constants
    private static final int SAT = 0;
    private static final int SUN = 1;
    private static final int MON = 2;
    private static final int TUE = 3;
    private static final int WED = 4;
    private static final int THU = 5;
    private static final int FRI = 6;

    // leap year calculation constants
    private static final int LEAP_YEAR_CYCLE        = 400;
    private static final int CENTURY_INTERVAL       = 100;
    private static final int LEAP_YEAR_INTERVAL     = 4;
    private static final int LEAP_YEAR_NO_REMAINDER = 0;

    // century offsets
    private static final int START_EIGHTEEN_HUNDREDS    = 1800;
    private static final int END_EIGHTEEN_HUNDREDS      = 1899;
    private static final int START_TWENTY_FIRST_CENTURY = 2000;
    private static final int END_TWENTY_FIRST_CENTURY   = 2099;

    private static final int EIGHTEEN_HUNDREDS_OFFSET    = 2;
    private static final int TWENTY_FIRST_CENTURY_OFFSET = 6;

    // leap year offset
    private static final int LEAP_YEAR_JAN_FEB_OFFSET = 6;

    // getDayOfWeek division numbers
    private static final int STEP_FOUR = 12;

    private static final int STEP_FIVE = 12;

    private static final int STEP_SIX = 4;

    // instance variables
    private final int year;
    private final int month;
    private final int day;

    /**
     * Date creates an instance of a date from a year between 1800 - CURRENT_YEAR.
     *
     * @param year  the year
     * @param month the month of the year
     * @param day   the day of the month
     */
    public Date(final int year,
                final int month,
                final int day)
    {
        validateYear(year);
        validateMonth(month);
        validateDay(year, month, day);

        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    /**
     * Method from Printable interface that prints every instance variable in a sentence
     */
    @Override
    public void display()
    {
        System.out.println("The date is: " + getDayOfTheWeek() + ", " + getMonthName() + " " + day + ", " + year + ".");
    }

    /**
     * Returns the day of the month.
     *
     * @return the day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Returns the month of the year.
     *
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Returns the year.
     *
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Returns the date in the format YYYY-MM-DD.
     *
     * @return the date formatted
     */
    public String getYYYYMMDD()
    {
        String result;

        result = String.format("%d-%02d-%02d", year, month, day);
        return result;
    }

    /**
     * Returns the day of the week the date is.
     * Steps:
     * 1) Apply century offsets:
     * - +6 for 2000's
     * - +2 for 1800's
     * 2) Apply leap-year offset of +6 if the month is JAN or FEB
     * 3) Calculate the last two digits of the year (yearInCentury)
     * 4) Calculate the numberOfTwelves in yearInCentury
     * 5) Calculate the remainderOfTwelves
     * 6) Calculate the numberOfFours in remainderOfTwelves
     * 7) Add the previous calculations + the day of the month
     * 8) Add the month code from getMonthCode()
     * 9) Calculate modulus 7 to get the weekday index
     * 10) Call getWeekdayFromIndex(weekdayIndex)
     *
     * @return the weekday as a String
     */
    public String getDayOfTheWeek()
    {
        int yearInCentury;
        int numberOfTwelves;
        int remainderOfTwelves;
        int numberOfFours;
        int weekdayIndex;

        weekdayIndex = 0;

        // 1) check and apply century offsets
        if (year >= START_TWENTY_FIRST_CENTURY && year <= END_TWENTY_FIRST_CENTURY)
        {
            weekdayIndex += TWENTY_FIRST_CENTURY_OFFSET;
        }
        else if (year >= START_EIGHTEEN_HUNDREDS && year <= END_EIGHTEEN_HUNDREDS)
        {
            weekdayIndex += EIGHTEEN_HUNDREDS_OFFSET;
        }

        // 2) check and apply leap year offset
        if (isLeapYear(year) && (month == JAN || month == FEB))
        {
            weekdayIndex += LEAP_YEAR_JAN_FEB_OFFSET;
        }

        // 3 - 6)
        yearInCentury      = year % CENTURY_INTERVAL;
        numberOfTwelves    = yearInCentury / STEP_FOUR;
        remainderOfTwelves = yearInCentury % STEP_FIVE;
        numberOfFours      = remainderOfTwelves / STEP_SIX;

        // 7 - 9)
        weekdayIndex += day + numberOfTwelves + numberOfFours + remainderOfTwelves;
        weekdayIndex += getMonthCode();
        weekdayIndex %= 7;

        // 10)
        return getWeekdayFromIndex(weekdayIndex);

    }

    /**
     * Returns the month code given the month.
     *
     * @return the month code
     */
    private int getMonthCode()
    {
        if (month == JAN || month == OCT)
        {
            return JAN_OCT_CODE;
        }
        else if (month == FEB || month == MAR || month == NOV)
        {
            return FEB_MAR_NOV_CODE;
        }
        else if (month == APR || month == JULY)
        {
            return APR_JULY_CODE;
        }
        else if (month == MAY)
        {
            return MAY_CODE;
        }
        else if (month == JUNE)
        {
            return JUNE_CODE;
        }
        else if (month == AUG)
        {
            return AUG_CODE;
        }
        else
        {
            return SEP_DEC_CODE;
        }
    }

    /**
     * Returns the weekday as a String.
     *
     * @param weekday the weekday index
     * @return the weekday
     */
    private String getWeekdayFromIndex(final int weekday)
    {
        return switch (weekday)
        {
            case SAT -> "Saturday";
            case SUN -> "Sunday";
            case MON -> "Monday";
            case TUE -> "Tuesday";
            case WED -> "Wednesday";
            case THU -> "Thursday";
            case FRI -> "Friday";
            default -> throw new IllegalArgumentException("Invalid weekday value: " + weekday);
        };

    }

    /**
     * Returns the month name given the index number.
     *
     * @return the month name as a String
     */
    public String getMonthName()
    {
        return switch (month)
        {
            case JAN -> "January";
            case FEB -> "February";
            case MAR -> "March";
            case APR -> "April";
            case MAY -> "May";
            case JUNE -> "June";
            case JULY -> "July";
            case AUG -> "August";
            case SEP -> "September";
            case OCT -> "October";
            case NOV -> "November";
            case DEC -> "December";
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }

    /**
     * Validates if the year is between MIN_YEAR and CURRRENT_YEAR.
     *
     * @param year the year
     */
    private static void validateYear(final int year)
    {
        if (year < MIN_YEAR || year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid Year: " + year);
        }
    }

    /**
     * Validates if the month is between MIN_MONTH and MAX_MONTH.
     *
     * @param month the month of the year
     */
    private static void validateMonth(final int month)
    {
        if (month < MIN_MONTH || month > MAX_MONTH)
        {
            throw new IllegalArgumentException("Invalid Month: " + month);
        }
    }

    /**
     * Validates if the month is between MIN_DAY and one of MAX_DAY_TWENTY_EIGHT, MAX_DAY_THIRTY, and
     * MAX_DAY_THIRTY_ONE.
     *
     * @param month the month of the year
     * @param day   the day of the month
     */
    private static void validateDay(final int year,
                                    final int month,
                                    final int day)
    {
        validateMonth(month);

        if (day < MIN_DAY)
        {
            throw new IllegalArgumentException("Invalid Day - Too low: " + day);
        }
        else if (month == FEB)
        {
            if (day > MAX_DAY_TWENTY_NINE)
            {
                throw new IllegalArgumentException("Invalid Day - Too high: " + day);
            }
            else if (day == MAX_DAY_TWENTY_NINE && !isLeapYear(year))
            {
                throw new IllegalArgumentException("Invalid Day - Not a leap year: " + day);
            }
        }
        else if (month == APR || month == JUNE || month == SEP || month == NOV)
        {
            if (day > MAX_DAY_THIRTY)
            {
                throw new IllegalArgumentException("Invalid Day - Too high: " + day);
            }
        }
        else
        {
            if (day > MAX_DAY_THIRTY_ONE)
            {
                throw new IllegalArgumentException("Invalid Day - Too high: " + day);
            }
        }

    }

    /**
     * Returns true when the year is a leap year, and false otherwise.
     *
     * @param year the year being checked
     * @return true if the year is a leap year
     */
    private static boolean isLeapYear(final int year)
    {
        if (year % LEAP_YEAR_CYCLE == LEAP_YEAR_NO_REMAINDER)
        {
            return true;
        }
        else if (year % LEAP_YEAR_INTERVAL == LEAP_YEAR_NO_REMAINDER)
        {
            return year % CENTURY_INTERVAL != LEAP_YEAR_NO_REMAINDER;
        }
        return false;
    }

    /**
     * Returns true if this date is before the other date, and false otherwise.
     *
     * @param other the other date being compared to
     * @return true if this date is before the other date
     */
    public boolean isBefore(final Date other)
    {
        if (this.year != other.year)
        {
            return this.year < other.year;
        }
        if (this.month != other.month)
        {
            return this.month < other.month;
        }
        return this.day < other.day;
    }
}
