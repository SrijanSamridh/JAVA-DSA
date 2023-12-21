package DSA.trees;
import java.util.Stack;

class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node root;

    void inorderWithRecur(Node node)
    {
        if (node == null)
            return;

        inorderWithRecur(node.left);
        System.out.print(node.data + " ");
        inorderWithRecur(node.right);
    }

    // without recursion
    void inorderWithoutRecur(Node node){
        Stack<Node> stack = new Stack<Node>();
        Node curr = node;

        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        tree.inorderWithoutRecur(tree.root);
    }
}
