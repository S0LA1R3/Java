import java.util.Scanner;

public class HeartRatesTest
{
    public static void main(String[] args)
    {
        HeartRates pessoa = new HeartRates("Guilherme", "Braga", 21, 12, 2005);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter patient first name: ");
        String firstName = input.nextLine();
        pessoa.setFirstName(firstName);

        System.out.print("Enter patient last name: ");
        String lastName = input.nextLine();
        pessoa.setLastName(lastName);

        System.out.printf("Enter patient birth in sequence (day/month/year):%n");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        pessoa.setBirthday(day, month, year);

        System.out.printf("%nPatient name: %s %s%nPatient birthday: %s%nPatient Age: %s%nPatient Max Heart Rate: %d%nPatient target heart rate: %.0f%n",
                pessoa.getFirstName(), pessoa.getLastName(), pessoa.getBirthDay(), pessoa.getAge(), pessoa.getMaxHeartRate(), pessoa.getTargetHeartRate());
    }
}
