package BinaryTree;

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(25);
        tree.insert(40);
        tree.insert(35);
        tree.insert(45);
        tree.insert(70);
        tree.insert(60);
        tree.insert(55);
        tree.insert(65);
        tree.insert(80);
        tree.insert(75);
        tree.insert(85);

        tree.inOrder();     //Vänster->Rot->Höger (sorterad ordning)
        tree.preOrder();    //Rot->Vänster->Höger
        tree.postOrder();   //Vänster->Höger->Rot
    }
}