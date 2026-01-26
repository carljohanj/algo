
public class RecursiveFibonacci
{
    static long counter = 0;

    public static void main(String[] args)
    {
        int n = 50;
        long result = fib(n);
        System.out.println("Det krävdes " + counter + " metodanrop för att beräkna" +
                "det " + n + ":e fibonaccinumret, som är " + result);
    }


    public static long fib(int n)
    {
        counter++;
        //Basfall:
        if (n <= 1) { return n; }

        return fib(n-1) + fib(n-2);
    }
}
