package DSA_450.Graph;

public class MirrorTree{
    static class Node {
        int val;
        Node left, right;
        Node(int value) {
            val = value;
            left = right = null;
        }
    }
    public static class BinaryTreeMirror {
        Node root;

        public void mirror(Node root) {
            if (root == null)
                return;
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirror(root.left);
            mirror(root.right);
        }

        public void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }

        public static void main(String[] args) {
            BinaryTreeMirror tree = new BinaryTreeMirror();
            tree.root = new Node(5);
            tree.root.left = new Node(3);
            tree.root.right = new Node(6);
            tree.root.left.left = new Node(2);
            tree.root.left.right = new Node(4);

            System.out.print("Inorder of original tree: ");
            tree.inorderTraversal(tree.root);
            System.out.println();

            tree.mirror(tree.root);
            System.out.print("Inorder of mirror tree: ");
            tree.inorderTraversal(tree.root);
        }
    }
}
