import java.util.Scanner;

public class Exam
{
    public static void main(String[] args)
    {
        int correct = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("hahahahahaha");
        String answer = input.nextLine();
        switch (answer)
        {
            case "c" -> ++correct;
        }

        System.out.printf("%nWhich is the most powerful pose of all the world?%nA) Jotaro pose%nB) T-Pose%nC) V-Pose%nD) Solaire Pose%n");
        answer = input.nextLine();
        switch (answer)
        {
            case "d" -> ++correct;
        }

        System.out.printf("%nWhich is the best stando powah?%nA) Time Stop%nB) PIANO%nC) Strong Man%nD) Strange Fluied%n");
        answer = input.nextLine();
        switch (answer)
        {
            case "b" -> ++correct;
        }

        switch (correct)
        {
            case 3 -> System.out.printf("%nAwesome");
            case 2 -> System.out.printf("%nGood");
            default -> System.out.printf("%nUgly!");
        }
    }
}
