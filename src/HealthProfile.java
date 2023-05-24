public class HealthProfile
{
    private String firstName, lastName, sex;
    private int day, month, year;
    private double height, weight;

    public HealthProfile(String firstName, String lastName, String sex, int day, int month, int year, double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;

        if (day >= 1)
            if (day <= 31)
                this.day = day;
        else
            this.day = 1;

        if (month >= 1)
            if (month <= 12)
                this.month = month;
        else
            this.month = 1;

        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public String getSex()
    {
        return sex;
    }

    public void setBirthday(int day, int month, int year)
    {
        if (day >= 1)
            if (day <= 31)
                this.day = day;
            else
                day = 1;
        if (month >= 1)
            if (month <= 12)
                this.month = month;
            else
                month = 1;
        this.year = year;
    }
    public String getBirthDay()
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

    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return 2023 - year;
    }

    public int getMaxHeartRate()
    {
        return 220 - getAge();
    }

    public double getTargetHeartRate()
    {
        return getMaxHeartRate() * 0.675;
    }

    public double getIMC()
    {
        return getWeight()/(getHeight()*getHeight());
    }
}
