import java.util.LinkedList;
import java.util.Queue;

public class main1 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Binarytree {
        static int i = -1;

        public static Node buidtree(int[] nodes) {
            i++;
            if (nodes[i] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[i]);
            newnode.left = buidtree(nodes);
            newnode.right = buidtree(nodes);

            return newnode;

        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q1 = new LinkedList<>();
            q1.add(root);
            q1.add(null);
            while (!q1.isEmpty()) {
                Node node = q1.remove();
                if (node == null) {
                    System.out.println();
                    if (q1.isEmpty()) {
                        break;
                    } else {
                        q1.add(null);
                    }
                } else {
                    System.out.print(node.data + " ");
                    if (node.left != null) {
                        q1.add(node.left);
                    }
                    if (node.right != null) {
                        q1.add(node.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buidtree(nodes);
        System.out.println(root.data);
        tree.levelOrder(root);

    }
}
