public class Facebook
{
    public static void main(String[] args)
    {
        int month = 0;

        for (double users = 1; users < 2; users *= 1.04)
        {
            ++month;
        }

        System.out.printf("Months elapsed: %d", month);
    }
}
