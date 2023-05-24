import java.util.Scanner;

public class HealthProfileTest
{
    public static void main(String[] args)
    {
        HealthProfile paciente = new HealthProfile("Guilherme", "Braga", "Male",
                21, 10, 2005, 1.73, 56);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter patient first name: ");
        String firstName = input.nextLine();
        paciente.setFirstName(firstName);

        System.out.print("Enter patient last name: ");
        String lastName = input.nextLine();
        paciente.setLastName(lastName);

        System.out.printf("Enter patient birth in sequence (day/month/year):%n");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        paciente.setBirthday(day, month, year);

        System.out.print("Enter patient height: ");
        double height = input.nextDouble();
        paciente.setHeight(height);

        System.out.print("Enter patient weight: ");
        double weight = input.nextDouble();
        paciente.setWeight(weight);
        System.out.printf("%nPatient name: %s %s%nPatient birthday: %s%nPatient Age: %s%nPatient Max Heart Rate: %d%nPatient target heart rate: %.0f%nPatient BMI: %.1f%n%n",
                paciente.getFirstName(), paciente.getLastName(), paciente.getBirthDay(), paciente.getAge(), paciente.getMaxHeartRate(), paciente.getTargetHeartRate(), paciente.getIMC());
        System.out.printf("BMI VALUES%nUnderweight: less than 18,5%nNormal: between 18,5 and 24,9%nOverweight: between 25 and 29,9%nObese: 30 or greater");
    }
}
