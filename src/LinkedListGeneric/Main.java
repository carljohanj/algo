package LinkedListGeneric;

public class Main
{
    public static void main(String[] args)
    {
        GenericLinkedList<Integer> list1 = new GenericLinkedList<Integer>();
        list1.add(5);
        list1.add(29);
        list1.add(23);

        GenericLinkedList<Boolean> list2 = new GenericLinkedList<Boolean>();
        list2.add(true);
        list2.add(false);
        list2.add(false);

        GenericLinkedList<String> list3 = new GenericLinkedList<String>();
        list3.add("Hello");
        list3.add("world!");

    }
}
