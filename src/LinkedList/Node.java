package LinkedList;

/**
 * En rekursiv datastruktur som innehåller en instans av sig själv o_O
 * Mkt användbar för att bygga andra strukturer som t.ex. LinkedList, träd, osv.
 */
public class Node
{
    public int data;
    public Node nextNode;

    public Node(int data)
    {
        this.data = data;
    }
}
