package linkedList;

public class Doublylinkedlist {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public Node addfirst(int data) {
        Node temp = new Node(data);
        size++;
        if(head==null){
            head = tail = temp;
            return head;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }
    // remove
    public int removefirst(){
        if(head == null){
            System.out.println("LinkedList is Empty.");
            return 0;
        }else if(head.next == null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }else{
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next=prev;
            curr.prev=next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Doublylinkedlist dll = new Doublylinkedlist();
        dll.addfirst(30);
        dll.addfirst(20);
        dll.addfirst(10);

        dll.print();
        
        dll.removefirst();
        dll.print();
        
        dll.reverse();
        dll.print();



    }
}
