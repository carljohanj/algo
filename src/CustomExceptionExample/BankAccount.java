package CustomExceptionExample;

public class BankAccount
{
    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount > balance)
        {
            throw new InsufficientFundsException("Not enough money on your account!");
        }
    }

}
