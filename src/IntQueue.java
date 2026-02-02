import LinkedList.Node;

/**
 * En kö som kan lagra integers. Kön är byggd med hjälp av den rekursiva
 * Node-klass som vi skapade på föreläsningen för att illustrera hur
 * noder ofta används som byggstenar för mer avancerade datastrukturer.
 *
 * Kön har O(1) i tidskomplexitet för både insättning och uthämtning.
 */
public class IntQueue
{
    private Node head;
    private Node tail;

    public void enqueue(int value)
    {
        //Vi börjar med att skapa en node som vi vill lägga till i kön:
        Node newNode = new Node(value);

        //Om det inte redan finns något värde i head så måste kön vara tom, och vi sätter i så fall
        //head och tail så att de båda pekar mot noden vi lägger in (kön har bara ett värde så
        //första och sista värdet måste vara samma plats):
        if (head == null)
        {
            head = tail = newNode;
            return;
        }

        //Om det däremot redan finns värden i kön så går vi vidare:
        tail.nextNode = newNode;

        tail = newNode;
    }

    public int deque()
    {
        //Vi börjar med att hämta ut värdet som ligger först i kön (detta är alltid head):
        int value = head.data;

        //Vi pekar sedan om head-noden så att den pekar mot nextNode inuti sig själv:
        head = head.nextNode;

        //Om det inte finns fler värden i listan kommer head att vara null nu, för nextNode har inte initialiserats.
        // I så fall måste vi se till att tail också är null:
        if (head == null)
        {
            tail = null;
        }

        //Slutligen returnerar vi värdet vi hämtade ut:
        return value;
    }
}
