package BinaryTree;

/**
 * En klass som innehåller två instanser av sig själv. Vi använder sådana här noder för att
 * bygga en binär trädstruktur.
 */
public class TreeNode
{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value)
    {
        this.value = value;
    }
}