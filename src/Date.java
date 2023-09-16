public class Date
{
    private int month,
            day,
            year;

    private static final int[] daysPerMonth =
    {0, 31, 28, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year)
    {
        if(month <= 0 || month > 12)
            throw new IllegalArgumentException(
                "month (" + month + ") must be 1-12");

        if(day <= 0 ||
            (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

        if(month == 2 && day == 29 && !(year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)))
        throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
            "Date object constructor for date %s%n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
    public void setMonth(int month)
    {
        if (month >= 1)
            if (month <= 12)
                this.month = month;
        else
            this.month = 1;
    }
    public int getMonth()
    {
        return month;
    }

    public void setDay(int day)
    {
        if (day >= 1)
            if (day <= 31)
                this.day = day;
        else
            this.day = 1;
    }
    public int getDay()
    {
        return day;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }

    public String displayDate()
    {
        String date = "";
        if (day >= 10)
            if (month >= 10)
                date = String.format("%d/%d/%d", month, day, year);
            else
                date = String.format("0%d/%d/%d", month, day, year);
        else
            if (month >= 10)
                date = String.format("%d/0%d/%d", month, day, year);
            else
                date = String.format("0%d/0%d/%d", month, day ,year);

        return date;
    }
}
