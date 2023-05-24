import java.security.SecureRandom;
import java.util.Scanner;

public class MathQuizGenerator
{
    private static final SecureRandom random = new SecureRandom();
    private static int number1;
    private static int number2;
    private static int examType;
    private static String numbersQuantity = "9";
    private static Boolean randomOperation = false;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int correct = 0;
        int counter = 0;
        double answer = -1;
        double operation = number1 * number2;

        System.out.printf("Select the Exam type:%n%s%n",
                "(1 for addition | 2 for subtraction | 3 for multiplication | 4 for division | 5 for all)");
        examType = input.nextInt();
        if (examType == 5)
        {
            randomOperation = true;
        }

        System.out.print("Select the difficulty: ");
        int difficulty = input.nextInt();
        for (int i = 1; i < difficulty; ++i)
        {
            numbersQuantity = String.format("%s9", numbersQuantity);
        }

        while (counter < 10)
        {
            if (randomOperation)
            {
                examType = 1 + random.nextInt(4);
            }
            System.out.print(randomOperationSentence());
            switch (examType)
            {
                case 1 -> operation = number1 + number2;
                case 2 -> operation = number1 - number2;
                case 3 -> operation = number1 * number2;
                case 4 -> operation = (double) number1 / number2;
            }
            operation = Math.round(operation * 100.0) / 100.0;
            while (answer != operation && counter < 10)
            {
                answer = input.nextDouble();
                if (answer != operation)
                {
                    int choice = 1 + random.nextInt(4);
                    switch (choice)
                    {
                        case 1 -> System.out.println("No. Please, try again.");
                        case 2 -> System.out.println("Wrong. Try one more time");
                        case 3 -> System.out.println("Don't Surrender!");
                        case 4 -> System.out.println("No. Keep trying.");
                    }
                }
                ++counter;
            }

            input.nextLine();

            if (answer == operation)
            {
                ++correct;

                int choice = 1 + random.nextInt(4);
                switch (choice)
                {
                    case 1 -> System.out.println("Awesome!");
                    case 2 -> System.out.println("Very good!");
                    case 3 -> System.out.println("Good work!");
                    case 4 -> System.out.println("Keep a good work!");
                }
            }
        }

        if (correct > counter*0.75)
        {
            System.out.printf("Congratulations! You're ready to go to the next level. %d | %d", correct, counter);
        }
        else
        {
            System.out.print("Call help to your teacher.");
        }
    }

    public static String randomOperationSentence()
    {
        String sentence = String.format("%nHow much is %d * %d? ", number1, number2);
        number1 = random.nextInt(Integer.parseInt(numbersQuantity));
        number2 = random.nextInt(Integer.parseInt(numbersQuantity));
        switch (examType)
        {
            case 1 -> sentence = String.format("%nHow much is %d + %d? ", number1, number2);
            case 2 -> sentence = String.format("%nHow much is %d - %d? ", number1, number2);
            case 3 -> sentence = String.format("%nHow much is %d * %d? ", number1, number2);
            case 4 ->
            {
                number2 = 1 + random.nextInt(Integer.parseInt(numbersQuantity));
                sentence = String.format("%nHow much is %d/%d? ", number1, number2);
            }
        }
        return sentence;
    }
}
