public class RecursiveDynamicFibonacci
{
    static long[] memo;
    static int counter;

    public static void main(String[] args)
    {
        int n = 50;
        memo = new long[n + 1];
        System.out.println("Det " + n + " fibonaccitalet är " + fib(n));
        System.out.println("Antalet metodanrop för att beräkna " + n + " är " + counter);

    }

    public static long fib(int n)
    {
        counter++;
        if (n <= 1) { return n; }

        //Kolla om indexplatsen i memo redan
        //innehåller ett kalkylerat värde för fib()n:
        if (memo[n] != 0) { return memo[n]; }

        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }

}
