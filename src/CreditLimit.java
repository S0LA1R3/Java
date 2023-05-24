public class CreditLimit
{
    private int accountNumber, accountBalance, expense, appliedCredits, creditLimit;

    public CreditLimit(int accountNumber, int accountBalance, int expense, int appliedCredits, int creditLimit)
    {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.expense = expense;
        this.appliedCredits = appliedCredits;
        this.creditLimit = creditLimit;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }
    public int getAccountBalance()
    {
        return accountBalance;
    }

    public void setExpense(int expense)
    {
        this.expense = expense;
    }
    public int getExpense()
    {
        return expense;
    }

    public void setCreditLimit(int creditLimit)
    {
        this.creditLimit = creditLimit;
    }
    public int getCreditLimit()
    {
        return creditLimit;
    }

    public void setAppliedCredits(int appliedCredits)
    {
        this.appliedCredits = appliedCredits;
    }
    public int getAppliedCredits()
    {
        return appliedCredits;
    }
}
