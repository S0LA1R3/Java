public class ForTest
{
    public static void main(String[] args)
    {
        int p = 1000;
        double r = 0.05;
        double a = 0;

        System.out.printf("%s%20s%n", "year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year)
        {
            a = p * Math.pow(1 + r, year);
            System.out.printf("%4d%,20.2f%n", year, a);
        }
    }
}
