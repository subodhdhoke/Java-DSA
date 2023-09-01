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

    public static int removehead() {
        if (size == 0) {
            System.out.println("LinkedList is Empty.");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            Node temp = head;
            head = temp.next;
            temp.next = null;
            size--;
            return 0;
        }

        // int val = head.data;
        // head = head.next;
        // size--;
        // return val;

    }

    public static void removetail() {
        if (size == 0) {
            System.out.println("Empty list");
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            for (int i = 0; i <= Integer.MAX_VALUE; i++) {
                if (temp.next == tail) {
                    temp.next = null;
                    tail = temp;
                    break;
                }
                temp = temp.next;
            }
            size--;
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
        linkedList.removehead();
        System.out.println("Head removed ");
        linkedList.printlinkedlist();
        System.out.println("New Head = " + linkedList.head.data);
        linkedList.removetail();
        System.out.println("Tail removed ");
        linkedList.printlinkedlist();
        System.out.println("New Tail = " + linkedList.tail.data);

    }

}