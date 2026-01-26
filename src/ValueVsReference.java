import java.util.Arrays;

public class ValueVsReference
{
    public static void main(String[] args)
    {
        int myNumber = 10;
        passByValue(myNumber);
        System.out.println("Integern myNumber i main har värdet " + myNumber);

        int[] array = { 198, 2, 5, 205, 145, 34, 20, 10 };
        passByReference(array);

        for (int value : array)
        {
            System.out.println(value);
        }
    }

    public static void passByValue(int n)
    {
        n = n * 2;
        System.out.println("Den lokala kopian av myNumber har värdet " + n);
    }

    public static void passByReference(int[] array)
    {
        Arrays.sort(array);
    }
}
