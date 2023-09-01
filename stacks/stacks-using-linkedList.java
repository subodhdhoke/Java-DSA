public class main {
    public static class Node { // user defined data type
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class LLStack { // user defined data struture
        Node head = null;
        int size = 0;

        void push(int data){
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
            size++;
        }

        void displayreverse(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void helperdisplayrec(Node h){
            if(h == null){
                return;
            }
            helperdisplayrec(h.next);
            System.out.print(h.data+" ");

        }

        void display(){
            helperdisplayrec(head);
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head == null){
                System.out.println("Empty Stack ");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        int peek(){
            if(head == null){
                System.out.println("Empty Stack ");
                return -1;
            }
            return head.data;    
        }

        boolean isempty(){
            if(size == 0){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();

    }
}
