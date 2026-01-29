package MyArrayList;


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
