import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1,
            number2,
            sum;

        System.out.print("Enter the first number: ");

        number1 = input.nextInt();

        System.out.print("Enter tbe second number: ");

        number2 = input.nextInt();

        sum = number1 + number2;

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        System.out.printf("The sum is %d%n", sum);

        input.close();
    }
}
