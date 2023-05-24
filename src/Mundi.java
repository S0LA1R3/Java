public class Mundi
{
    public static void main(String[] args)
    {
        double population = 7.888;
        double increase = 0;
        int year = 2022;
        int counter = 0;

        while (counter < 75)
        {
            ++counter;

            if (counter == 1)
            {
                System.out.printf("Year      World Population      Increase%n%n");
            }

            System.out.printf("%d         %.3f B            %.3f B%n", year, population, increase);

            ++year;
            increase = population;
            population += population*0.09;
            increase = population - increase;
        }
    }
}
