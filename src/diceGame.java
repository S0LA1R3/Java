import java.security.SecureRandom;
import java.util.Scanner;

public class diceGame
{
    public static void main(String[] args)
    {
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int pontuation = 0;
        int counter2 = 0;
        boolean win = false;

        while (!win)
        {
            for (int counter = 0; counter < 2; ++counter)
            {
                int face = 1 + randomNumbers.nextInt(6);
                sum += face;
            }

            if (counter2 == 0)
            {
                switch (sum)
                {
                    case 7, 11 ->
                    {
                        System.out.printf("Your sum is %d.%nYou win!", sum);
                        win = true;
                    }
                    case 2, 3, 12 ->
                    {
                        System.out.printf("Your sum is %d.%nYou lose!", sum);
                        win = true;
                    }
                    default ->
                    {
                        pontuation = sum;
                        System.out.printf("Your sum is %d.%nNow your score is %d.", sum, pontuation);

                        System.out.printf("%n%nEnter to continue");
                        input.nextLine();
                        System.out.println();
                    }
                }
            }
            else if (pontuation == sum)
            {
                System.out.printf("Your sum is: %d. It's equal to your score!.%nCongratulation you win!", sum);
                win = true;
            }
            else
            {
                pontuation = sum;
                System.out.printf("Your sum is %d.%nNow your score is %d.", sum, pontuation);

                System.out.printf("%n%nEnter to continue");
                input.nextLine();
                System.out.println();
            }

            sum = 0;

            ++counter2;
        }
    }
}
