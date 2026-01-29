package LinkedList;

/**
 * En simpel version av en länkad lista som bara kan lagra integers.
 * Listan använder sig av Node-klassen vi skrev för att skapa "länkar"
 * (tänk länkar i en kedja) som vi hänger på när vi vill förlänga listan.
 */
public class SingleLinkedList
{
    private Node head;

    public void add(int data)
    {
        //Vi börjar med att göra en ny nod (dvs en ny länk) som håller värdet vi vill lägga till:
        Node newNode = new Node(data);

        //Vi behöver först kolla om det finns någonting i den första noden: Om den noden skulle
        //vara tom pekar vi den mot den nya noden som vi skapade ovan:
        if (head == null)
        {
            head = newNode;
            return;
        }

        //Annars besöker vi den här noden och kollar vi om den nod som finns inuti head är tom.
        //Om inte den noden heller skulle vara tom fortsätter vi iterera genom noderna
        //tills vi hittar en som är null (dvs inte har initialiserats).
        Node current = head;
        while (current.nextNode != null)
        {
            current = current.nextNode;
        }

        //Loopen stoppar när vi hittat en node som inte initialiserats ännu, och där hänger vi
        //på noden som vi skapade i början:
        current.nextNode = newNode;
    }
}
