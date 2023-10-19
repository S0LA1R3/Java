import java.util.Scanner;

public class DateTest
{
    public static void main(String[] args)
    {
        Date date = new Date(4, 7, 2023);
        Scanner input = new Scanner(System.in);

        System.out.printf("The saved date is %s%n%n", date.displayDate());

        System.out.print("Enter the actual month: ");
        int month = input.nextInt();
        date.setMonth(month);

        System.out.print("Enter the actual day: ");
        int day = input.nextInt();
        date.setDay(day);

        System.out.print("Enter the actual year: ");
        int year = input.nextInt();
        date.setYear(year);

        System.out.printf("%nThe actual date is %s", date.displayDate());

        input.close();
    }
}
