import java.util.*;

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

        // public static int height(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int rightheight = height(root.right);
        // int leftheight = height(root.left);
        // return Math.max(rightheight, leftheight) + 1;
        // }

        // public static int numberOfNodes(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int leftnodes = numberOfNodes(root.left);
        // int rightnodes = numberOfNodes(root.right);
        // return leftnodes + rightnodes + 1;
        // }

        // public static int sumOfNodes(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int l = sumOfNodes(root.left);
        // int r = sumOfNodes(root.right);
        // return l + r + root.data;
        // }

        // public static int diameter(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int leftDiameter = diameter(root.left);
        // int rightDiameter = diameter(root.right);
        // int selfdiameter = height(root.left) + height(root.right) + 1;
        // return Math.max(leftDiameter, Math.max(rightDiameter, selfdiameter));
        // }

        // public static class Info {
        // int ht;
        // int dia;

        // public Info(int height, int diameter) {
        // this.ht = height;
        // this.dia = diameter;
        // }
        // }

        // public static Info diameteroftree(Node root) {
        // if (root == null) {
        // return new Info(0, 0);
        // }
        // Info left = diameteroftree(root.left);
        // Info right = diameteroftree(root.right);
        // Info self = new Info(Math.max(left.ht, right.ht) + 1, left.ht + right.ht +
        // 1);
        // Info ans = new Info(self.ht, Math.max(self.dia, Math.max(left.dia,
        // right.dia)));
        // return ans;
        // }

    }
    // public static boolean subtree(Node root , Node subroot){
    // if(root == null){
    // return false;
    // }

    // if(root.data == subroot.data){
    // if(isidentical(root , subroot)){
    // return true;
    // }
    // }
    // boolean l = subtree(root.left, subroot);
    // boolean r = subtree(root.right, subroot);
    // return l||r;
    // }
    // public static boolean isidentical(Node root , Node subroot){
    // if(root == null && subroot == null){
    // return true;
    // }
    // if(root == null || subroot == null || root.data != subroot.data){
    // return false;
    // }
    // if(root.data == subroot.data){
    // return true;
    // }
    // boolean checkleft = isidentical(root.left, subroot.left);
    // boolean checkright = isidentical(root.right, subroot.right);
    // return checkleft&&checkright;
    // }

    public static void topview(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int minhd = 0;
        int maxhd = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    minhd = Math.min(minhd, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    maxhd = Math.max(maxhd, curr.hd + 1);
                }

            }

        }
        for (int i = minhd; i <= maxhd; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();

    }

    public static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topview(root);

    }

}
