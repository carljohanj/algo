package LinkedListGeneric;

/**
 * En generisk version av Node där vi anger vilken datatyp noden
 * ska innehålla först när vi skapar en instans av den:
 * @param <Type> Datatypen som Node ska lagra
 */
public class Node<Type>
{
    Type data;
    public Node<Type> nextNode;

    public Node(Type data)
    {
        this.data = data;
    }
}
