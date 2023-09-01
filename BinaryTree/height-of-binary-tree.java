
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

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int rightheight = height(root.right);
            int leftheight = height(root.left);
            return Math.max(rightheight, leftheight) + 1;
        }
        public static int numberOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftnodes = numberOfNodes(root.left);
            int rightnodes = numberOfNodes(root.right);
            return leftnodes+rightnodes+1;
        }
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int l = sumOfNodes(root.left);
            int r = sumOfNodes(root.right);
            return l+r+root.data;
        }

        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int selfdiameter = height(root.left)+height(root.right)+1;
            return Math.max(leftDiameter,Math.max(rightDiameter,selfdiameter));
        }
        public static class Info{
            int ht;
            int dia;
            public Info(int height , int diameter){
                this.ht = height;
                this.dia = diameter;
            }
        }
        public static Info diameteroftree(Node root){
            if(root == null){
                return new Info(0,0);
            }
            Info left = diameteroftree(root.left);
            Info right = diameteroftree(root.right);
            Info self = new Info(Math.max(left.ht,right.ht)+1,left.ht+right.ht+1);
            Info ans = new Info(self.ht,Math.max(self.dia,Math.max(left.dia,right.dia)));
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buidtree(nodes);
        System.out.println(root.data);
        // System.out.println(tree.height(root));
        // System.out.println(tree.numberOfNodes(root));
        // System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.diameteroftree(root).dia);

    }

}
