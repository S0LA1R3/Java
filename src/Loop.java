public class Loop
{
    public static void main(String[] args)
    {
        int counter = 0;

        while (counter < 5)
        {
            ++counter;
            if (counter == 1)
            {
                System.out.printf("N    %d*N    %d*N    %d*N%n%n", counter*10, counter*100, counter*1000);
            }
            System.out.printf("%d   %d    %d    %d%n", counter, counter*10, counter*100, counter*1000);
        }
    }
}
