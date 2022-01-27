package Day10;

public enum WeekDay { // enum class with abbreviation in it .
    MONDAY(1),TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int abbr;
    WeekDay(int abbr){    // constructor of enum class
        this.abbr = abbr;
    }

    public int getAbbr() {  // getter method for enum to get the values.
        return abbr;
    }
}


