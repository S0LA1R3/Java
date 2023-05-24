import java.util.Scanner;

public class AccountTest
{
    public static void displayAccount(Account accountToDisplay)
    {
        System.out.printf("Account name: %s%nAccount balance: %.2f%n%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account("myAccount", 123.321);
        Account yourAccount = new Account("yourAccount", -12.45);

        displayAccount(myAccount);

        System.out.print("Please enter the myAccount name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        displayAccount(myAccount);

        System.out.print("Enter deposit amount for myAccount: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to myAccount balance%n%n",
                depositAmount);
        myAccount.deposit(depositAmount);

        displayAccount(myAccount);

        System.out.print("Enter withdraw amount for myAccount: ");
        double withdrawAmount = input.nextDouble();
        input.nextLine();
        System.out.printf("%nWithdrawing %.2f from myAccount balance%n%n", withdrawAmount);
        myAccount.withdraw(withdrawAmount);

        displayAccount(myAccount);

        displayAccount(yourAccount);

        System.out.print("Please enter the yourAccount name: ");
        theName = input.nextLine();
        yourAccount.setName(theName);
        System.out.println();

        displayAccount(yourAccount);

        System.out.print("Enter deposit amount for yourAccount: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to yourAccount balance%n%n",
                yourAccount.getBalance());
        yourAccount.deposit(depositAmount);

        displayAccount(yourAccount);

        System.out.print("Enter withdraw amount for yourAccount: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdrawing %.2f from yourAccount balance%n%n", withdrawAmount);
        yourAccount.withdraw(withdrawAmount);

        displayAccount(yourAccount);

        displayAccount(myAccount);
        displayAccount(yourAccount);
    }
}
