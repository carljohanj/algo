/**
 * En väldigt enkel stack som implementeras med hjälp av en array.
 * Stacken kan endast hantera integers, men skulle lätt kunna göras
 * generisk för att hantera alla typer av data.
 */
public class IntStack
{
    private int[] data;
    private int top = 0;
    private  final int DEFAULT_CAPACITY = 10;

    //Vi försäkrar oss om att data alltid har initialiserats när vi skapar en instans av stacken:
    public IntStack()
    {
        data = new int[DEFAULT_CAPACITY];
    }

    public void push(int value)
    {
        data[top] = value;
        top++;
    }

    public int pop()
    {
        top--;
        return data[top];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }
}
