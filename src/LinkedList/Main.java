package LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        SingleLinkedList list = new SingleLinkedList();
        list.add(5);   //Läggs till i datafältet inuti head
        list.add(29);  //Läggs till i datafältet i undernoden till head
        list.add(23);  //Läggs till i datafältet i undernoden inuti undernoden till head
    }
}
