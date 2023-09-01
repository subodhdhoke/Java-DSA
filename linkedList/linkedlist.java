package linkedList;

public class linkedlist { // linked list class
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node { // node subclass
        int data; // data of the node
        Node next; // adress of the next node

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String args[]) {
        Node a = new Node(5);
        System.out.println(a.next);     
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        //5 nodes created but no linked
        //5 -> 3 -> 9 -> 8 -> 16
        System.out.println(a);     //prints the address of a
        System.out.println(a.next);
        a.next = b;               //stores the address of the b object inside the "next" attribute of a    
        System.out.println(a.next);       //print the value stored inside "next" attribute that is address of b
        System.out.println(b);
        b.next= c;
        c.next= d;
        d.next= e;

        //print the data of b using a 
        System.out.println(b.data);
        System.out.println(a.next.data);     //using a
        System.out.println(a.next.next.data);    //data of c using a

        Node temp = a;
        System.out.println(a.data);
        System.out.println(temp.data);
        for(int i=0 ; i<=Integer.MAX_VALUE ; i++){
            System.out.print(temp.data+" ");
            if(temp.next==null){
                break;
            }
            temp=temp.next;  
        }
        System.out.println();

        
        display(a);

    }
}