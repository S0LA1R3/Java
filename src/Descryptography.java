import java.util.Scanner;

public class Descryptography
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int data, thousand, hundred, ten, unit;

        System.out.print("Enter data: ");
        data = input.nextInt();
        thousand = data/1000;
        unit = data-data/10*10;
        ten = (data-data/100*100-unit)/10;
        hundred = (data-thousand*1000-ten-unit)/100;

        int descryptographedData = (thousand+3)%10*1000+(hundred+3)%10*100+(ten+3)%10*10+(unit+3)%10;

        System.out.printf("Descryptographed data: %d", descryptographedData);

        input.close();
    }
}
