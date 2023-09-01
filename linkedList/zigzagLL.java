package linkedList;

public class LinkedList {
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

    public void addfirst(int data) {
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

    public void printlinkedlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addinmiddle(int index, int data) {
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

    public void size() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i - 1);
    }

    public int removehead() {
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

    public void removetail() {
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

    public int search(int key) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void searchRecursive(int key, Node head, int i) {
        if (head == null) {
            System.out.println(-1);
            return;
        }
        if (head.data == key) {
            System.out.println(i);
            return;
        }
        searchRecursive(key, head.next, i + 1);
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public void PrintRecursive(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        PrintRecursive(head.next);
    }

    public void printReverse(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }

        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public Node reverseRecursive(Node head) {
        if (head.next == null) {
            return head;
        }
        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }

    public Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node zigzag(Node head) {
        // find mid
        Node mid = getmid(head);

        // reverse 2nd half
        Node righthead = mid.next;
        mid.next = null;

        Node newrighthead = reverseRecursive(righthead);
        Node newlefthead = head;

        // create new list
        Node zigzagLL = new Node(-1);
        Node temp = zigzagLL;

        while (newlefthead != null && newrighthead != null) {
            temp.next = newlefthead;
            newlefthead = newlefthead.next;
            temp = temp.next;

            temp.next = newrighthead;
            newrighthead = newrighthead.next;
            temp = temp.next;

            
        }
        while (newlefthead != null) {
            temp.next = newlefthead;
            newlefthead = newlefthead.next;
            temp = temp.next;
        }
        return zigzagLL.next;

    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.addfirst(100);
        l1.addfirst(110);
        l1.addfirst(80);
        l1.addfirst(500);
        l1.addfirst(10);
        l1.addfirst(70);
        l1.addfirst(12);
        System.out.println("Linked list is ");
        l1.PrintRecursive(head);

        // l1.PrintRecursive(l1.mergesort(head));
        l1.PrintRecursive(l1.zigzag(head));

    }

}