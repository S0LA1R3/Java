/* Vinte estudantes foram solicitados a classificar em uma escala de 1 a 5 a qualidade da comida no refeitório
estudantil, com  1 sendo “horrível” e 5 sendo “excelente”. Coloque as 20 respostas em um array de inteiros e
determine a frequência de cada classificação. */

import java.util.Scanner;

public class Answers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] frequency = new int[5];

        for (int i = 0; i < 20; i++)
        {
            System.out.printf("Enter the grade of the %d° stundent: ", i+1);
            int grade = input.nextInt();
            try
            {
                ++frequency[grade-1];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf("    %d° grade = %d%n%n", i+1, grade);
            }
        }

        System.out.println("Grade     Frequency");

        for (int i = 0; i < frequency.length; i++)
        {
            System.out.printf("%5d%14d%n", i+1, frequency[i]);
        }
    }
}
