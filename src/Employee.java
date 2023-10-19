public class Employee
{
    private static int count = 0;
    private String firstName,
    lastName;
    private Date birthDate;
    private Date hireDate;
    private double salary;

    public Employee(String firstName, String lastName, double salary, Date birthDate, Date hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        if (salary > 0.0)
            this.salary = salary;

        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n",
        firstName, lastName, count);
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

    public void setSalary(double salary)
    {
        if (salary > 0.0)
            this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }

    public void plusSalary(Boolean percent, double plus)
    {
        if (percent == Boolean.TRUE)
            salary = salary + (salary*plus)/100;
        if (percent == Boolean.FALSE)
            salary = salary + plus;
    }

    public double getAnualSalary()
    {
        return salary * 12;
    }

    public static int getCount(){
        return count;
    }

    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s",
        lastName, firstName, hireDate, birthDate);
    }
}
