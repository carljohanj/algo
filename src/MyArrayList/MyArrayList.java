package MyArrayList;

/**
 * En simpel ArrayList med väldigt grundläggande funktionalitet. Vi sparar datan i
 * en underliggande int-array. Vid varje insättning kontrollerar vi om arrayen är
 * full, och i så fall skapar vi en dubbelt så stor array, kopierar över alla värden
 * i den, och pekar data mot den nya arrayen i stället.
 *
 * get() och add() har O(1) i tidskomplexitet medan grow() har O(n).
 */
public class MyArrayList
{
    private int[] data;
    private int lastElement;

    public MyArrayList()
    {
        data = new int[10];     //Samma defaultstorlek som Javas inbyggda ArrayList
    }

    public void add(int value)
    {
        if (data.length == lastElement) { grow(); }
        data[lastElement] = value;
        lastElement++;
    }

    public int get(int i)
    {
        return data[i];
    }

    private void grow() //2 O(n) + O(n) + O(1) + O(1) + O(1) = 3 O(n), dvs O(n)
    {
        int[] newData = new int[data.length * 2];   //2 O(n)

        for (int i = 0; i < lastElement; i++)       // O(n)
        {
            newData[i] = data[i];                   //O(1)
        }

        data = newData;                             //O(1)
        System.out.println("I just grew! :) My new size is: " + data.length);   //O(1)
    }

}
