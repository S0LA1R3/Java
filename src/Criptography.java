import java.util.Scanner;

public class Criptography
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int data, thousand, hundred, ten, unit;

        System.out.print("Enter data: ");
        data = input.nextInt();
        thousand = ((data/1000)+7)%10;
        unit = ((data-data/10*10)+7)%10;
        ten = (((data-data/100*100-(data-data/10*10))/10)+7)%10;
        hundred = (((data-(data/1000)*1000-(data-data/100*100-(data-data/10*10))-(data-data/10*10))/100)+7)%10;

        int cryptographedData = thousand*1000+hundred*100+ten*10+unit;

        System.out.printf("Cryptographed data: %d", cryptographedData);

        input.close();
    }
}
