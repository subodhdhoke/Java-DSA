package linkedList;

public class linkedlist { // linked list class
    public static class Node { // node subclass
        int data; // data of the node
        Node next; // adress of the next node

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addfirst(int data) {
        if (head == null) {
            Node newnode = new Node(data);
            head = tail = newnode;
            return;
        }
        // create new node
        Node newnode = new Node(data);
        // change the links
        newnode.next = head;
        // change head
        head = newnode;
    }

    public static void addlast(int data){
        if(head == null){
            Node newnode = new Node(data);
            head=tail=newnode;
            return;
        }
        Node newnode = new Node(data);
        newnode.next = null;
        tail.next = newnode;
        tail = newnode;
    }

    public static void main(String args[]) {
        linkedlist.addlast(10);
        linkedlist.addlast(20);
        linkedlist.addfirst(30);
        linkedlist.addfirst(40);

        Node temp = head;
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            System.out.print(temp.data + " ");
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        System.out.println();
    }
}