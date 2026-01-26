public class IterativeFibonacci
{
    static int counter = 1;

    public static void main(String[] args)
    {
         int n = 890;

        System.out.println("Det " + n + " fibonaccitalet är " + fib(n));
        System.out.println("Antal loopvarv för att beräkna talet: " + counter);
    }

    public static long fib(int n)
    {
        if (n <= 1) { return n; }

        //Fibonaccisekvensen: 0, 1, 1, 2, 3, 5, 8, 13, 21... osv

        long n1 = 0;
        long n2 = 1;
        long sum = 0;

        for (int i = 2; i <= n; i++)
        {
            counter++;
            sum = n2 + n1;
            n1 = n2;
            n2 = sum;
        }

        return sum;
    }

}
