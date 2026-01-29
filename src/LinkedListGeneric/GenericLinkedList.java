package LinkedListGeneric;

/**
 * En generisk version av en länkad lista, där vi kan ange vilken datatyp
 * den ska använda sig av när vi instansierar listan, till skillnad från
 * det icke-generiska exemplet som bara kan lagra integers.
 * @param <Type> Datatypen vi vill att listan ska lagra
 */
public class GenericLinkedList<Type>
{
    private Node<Type> head;

    public void add(Type data)
    {
        //Vi börjar med att göra en ny nod (dvs en ny länk) som håller värdet vi vill lägga till:
        Node<Type> newNode = new Node<>(data);

        //Vi behöver först kolla om det finns någonting i den första noden: Om den noden skulle
        // vara tom pekar vi den mot den nya noden som vi skapade ovan:
        if (head == null)
        {
            head = newNode;
            return;
        }

        //Annars besöker vi den här noden och kollar vi om den nod som finns inuti head är tom.
        //Om inte den noden heller skulle vara tom fortsätter vi iterera genom noderna
        //tills vi hittar en som är null (dvs inte har initialiserats).
        Node<Type> current = head;
        while (current.nextNode != null)
        {
            current = current.nextNode;
        }

        //Loopen stoppar när vi hittat en node som inte initialiserats ännu, och där hänger vi
        //på noden som vi skapade i början:
        current.nextNode = newNode;
    }
}
