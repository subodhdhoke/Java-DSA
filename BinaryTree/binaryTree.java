public class main2 {
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

        public static void preorder(Node root){
            if(root == null){
                System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buidtree(nodes);
        System.out.println(root.data);
        // tree.preorder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        tree.postorder(root);

    }
}