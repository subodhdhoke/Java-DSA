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
        Node temp = head;
        int i = 0;
        while (i < index-1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
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
        linkedList.addinmiddle(4,9);
        System.out.println("New Linked list is(9 added to 4th index) ");
        linkedList.printlinkedlist();
        

    }

}