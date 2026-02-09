package BinaryTree;

/**
 * Ett binärt sökträd som innehåller TreeNodes. Trädet söks av rekursivt
 * på tre olika vis: In-order, Pre-order och Post-order.
 * Binära sökträd implementeras bland annat av TreeMap i Javas standardbibliotek.
 */
public class BinaryTree
{
    private TreeNode root;

    /**
     * Sätter in ett värde i trädet
     * @param value Värdet som ska läggas till
     */
    public void insert(int value)
    {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value)
    {
        //Vi skapar en ny nod ifall rotnoden är null och lägger in värdet där:
        if (node == null)
        {
            System.out.println("Creating a new node for value " + value);
            return new TreeNode(value);
        }
        //Om rotnoden inte är null kollar vi om värdet är mindre än det i rotnoden, och
        //gör i så fall ett rekursivt anrop som lägger in värdet i den vänstra undernoden:
        if (value < node.value)
        {
            System.out.println("Going to the left in the tree");
            node.left = insertRecursive(node.left, value);
        }
        //Om värdet är större än det i rotnoden gör vi ett rekursivt anrop och lägger in
        //värdet i den högra undernoden i stället:
        else if (value > node.value)
        {
            System.out.println("Going to the right in the tree");
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }


    //Påbyggnader för traversering av trädet:

    /**
     * Sorterad output minst -> störst
     */
    public void inOrder()
    {
        System.out.println("\nIn-order traversal:");
        inOrderRecursive(root);
    }

    private void inOrderRecursive(TreeNode node)
    {
        if (node == null) return;

        inOrderRecursive(node.left);
        System.out.print(node.value + " ");
        inOrderRecursive(node.right);
    }

    /**
     * Roten först
     */
    public void preOrder()
    {
        System.out.println("\nPre-order traversal:");
        preOrderRecursive(root);
    }

    private void preOrderRecursive(TreeNode node)
    {
        if (node == null) return;

        System.out.print(node.value + " ");
        preOrderRecursive(node.left);
        preOrderRecursive(node.right);
    }

    /**
     * Roten sist
     */
    public void postOrder()
    {
        System.out.println("\nPost-order traversal:");
        postOrderRecursive(root);
    }

    private void postOrderRecursive(TreeNode node)
    {
        if (node == null) return;

        postOrderRecursive(node.left);
        postOrderRecursive(node.right);
        System.out.print(node.value + " ");
    }
}