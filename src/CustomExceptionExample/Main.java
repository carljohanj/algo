package CustomExceptionExample;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount acct = new BankAccount(1000);
        try
        {
            acct.withdraw(1200);
        } catch (InsufficientFundsException e)
        {
            throw new RuntimeException(e);
        }
    }
}