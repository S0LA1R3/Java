import java.security.SecureRandom;

public class DiceGame
{
    public static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST}
    private static final int TINY_BOOBS = 2;
    private static final int GIGA_NUMBER = 3;
    private static final int ANOTHER_GIGA = 7;
    private static final int ELEVEN = 11;
    private static final int SHOTGUN = 12;

    public static void main(String[] args)
    {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch(sumOfDice)
        {
            case ANOTHER_GIGA, ELEVEN ->
            {
                gameStatus = Status.WON;
                break;
            }
            case TINY_BOOBS, GIGA_NUMBER, SHOTGUN ->
            {
                gameStatus = Status.LOST;
                break;
            }
            default ->
            {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
            }
        }

        while (gameStatus == Status.CONTINUE)
        {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint)
            {
                gameStatus = Status.WON;
            } else if (sumOfDice == ANOTHER_GIGA)
            {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON)
        {
            System.out.print("Player wins");
        }
        else
        {
            System.out.print("Player loses");
        }
    }

    public static int rollDice()
    {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}
