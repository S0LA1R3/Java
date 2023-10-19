import java.util.Scanner;

public class Best
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int largest = 0;
        int counter = 0;

        while (counter < 10)
        {
            ++counter;
            System.out.printf("Enter the %d° number: ", counter);
            number = input.nextInt();
            if (number > largest)
            {
                largest = number;
            }
        }

        System.out.printf("%n%nThe largest number is %d.", largest);

        input.close();
    }
}
