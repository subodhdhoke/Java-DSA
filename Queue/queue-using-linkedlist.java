public class main1{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = tail.next;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            if(head.next == null){
                head = tail = null;
            } else{
                head=head.next;
            }
            return val;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String[] args) {
        
    }
}