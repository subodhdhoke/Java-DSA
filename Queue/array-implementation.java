public class main {
    public static class queueA {
        static int[] arr;
        static int size;
        static int rear;

        queueA(int n) {
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;

        }

        public static int remove() {     // this function take O(n) time which is very high for remove operation
            if (rear == -1) {                        //  thats why we use circular queue
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear = rear-1;
            return front; 
        }

        public static int peek() {
            if (rear == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        queueA q = new queueA(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());



    }
}