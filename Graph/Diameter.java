package DSA_450.Graph;

public class Diameter {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node root;
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return leftHeight + rightHeight + 1;
    }
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        int diameter = diameter(root);
        System.out.println("Diameter of the tree: " + diameter); // Output should be 3
    }
}
