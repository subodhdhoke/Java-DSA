public class main {
    public static class queue {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static void add(int data) {
            if ((rear + 1) % size == front) {
                System.out.println("Queue is full");
                return;
            }
            // adding 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empy queue");
                return -1;
            }
            int val = arr[front];
            // deleting last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empy queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}