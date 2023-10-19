import java.util.Scanner;

public class SevenHazard {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int counter;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter the %d° number (10-100): ", i+1);
            numbers[i] = input.nextInt();
            if (numbers[i] < 10 || numbers[i] > 100) {
                System.out.printf("Error!%n");
                i--;
            }
        }

        for (int i : numbers) {
            counter = 0;
            for (int y : numbers) {
                if (i == y)
                    counter++;
            }
            if (counter > 1)
                continue;

            System.out.printf("%nNumber: %d%n", i);
        }

        input.close();
    }
}
