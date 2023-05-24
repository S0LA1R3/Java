import java.util.Scanner;

public class CreditLimitTest
{
    public static void main(String[] args)
    {
        CreditLimit pessoa = new CreditLimit(13557941, 5000, 2500,
                1000, 7500);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int accountNumber = input.nextInt();
        pessoa.setAccountNumber(accountNumber);

        System.out.print("Enter the account balance: ");
        int accountBalance = input.nextInt();
        pessoa.setAccountBalance(accountBalance);

        System.out.print("Enter the expense: ");
        int expense = input.nextInt();
        pessoa.setExpense(expense);

        System.out.print("Enter the applied credits: ");
        int appliedCredits = input.nextInt();
        pessoa.setAppliedCredits(appliedCredits);

        System.out.print("Enter the credit limit: ");
        int creditLimit = input.nextInt();
        pessoa.setCreditLimit(creditLimit);

        int nextBalance = pessoa.getAccountBalance() + pessoa.getExpense() - pessoa.getAppliedCredits();
        System.out.printf("%nThe balance for next month is $%d,00.%n", nextBalance);

        if (nextBalance > pessoa.getCreditLimit())
        {
            System.out.printf("%nCredit limit exceeded!");
        }
    }
}
