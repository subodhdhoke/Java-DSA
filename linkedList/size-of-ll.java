package linkedList;

public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addfirst(int data) {
        if (head == null) {
            Node newnode = new Node(data);
            size++;
            head = tail = newnode;
            return;
        }
        // create new node
        Node newnode = new Node(data);
        size++;
        // change the links
        newnode.next = head;
        // change head
        head = newnode;
    }

    public static void printlinkedlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void addinmiddle(int index, int data) {
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static void size() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i - 1);
    }

    public static void removehead() {
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }

    public static void removetail() {
        Node temp = head;
        Node b;
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            if (temp.next == tail) {
                temp.next = null;
                tail = temp;
                break;
            }
            temp = temp.next;
        }

    }

    public static void main(String args[]) {
        linkedList l1 = new linkedList();
        linkedList.addfirst(100);
        linkedList.addfirst(90);
        linkedList.addfirst(80);
        linkedList.addfirst(70);
        linkedList.addfirst(60);
        linkedList.addfirst(50);
        System.out.println("Linked list is ");
        linkedList.printlinkedlist();
        System.out.println("Size is ");
        linkedList.size();
        System.out.println(linkedList.size);

    }

}