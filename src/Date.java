public class Date
{
    private int month,
            day,
            year;

    public Date(int month, int day, int year)
    {
        if (month >= 1)
            if (month <= 12)
                this.month = month;
        else
            this.month = 1;

        if (day >= 1)
            if (day <= 31)
                this.day = day;
        else
            this.day = 1;

        this.year = year;
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
