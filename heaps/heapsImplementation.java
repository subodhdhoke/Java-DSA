import java.util.*;
import java.util.ArrayList;

public class heapsImplementation {
    public static class Heap {
        static ArrayList<Integer> heap = new ArrayList<>();

        public static int size() {
            return heap.size();
        }

        public int peekFromHeap() {
            return heap.get(0);
        }

        public void printheap() {
            System.out.println(Heap.heap);
        }

        private static void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }

        public void insertIntoHeap(int val) {
            if (heap.size() == 0) {
                heap.add(val);
            } else {
                heap.add(val);
                int i = heap.size() - 1;
                int j = (i - 1) / 2;
                while (i > 0 && heap.get(i) < heap.get(j)) {
                    swap(i, j);
                    i = j;
                    j = (i - 1) / 2;
                }
            }
        }

        public int remove() {
            swap(0, heap.size() - 1);  //swap
            int val = heap.remove(heap.size() - 1);   //remove
            // heapify
            int i = 0;
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            while (r <= heap.size() - 1 && (heap.get(i) > heap.get(l) || heap.get(i) > heap.get(r))) {
                if (heap.get(l) > heap.get(r)) {
                    swap(i, r);
                    i = r;
                } else {
                    swap(i, l);
                    i = l;
                }
                l = 2 * i + 1;
                r = 2 * i + 2;
            }
            if (l == heap.size() - 1 && heap.get(i) > heap.get(l)) {
                swap(i, l);
            }
            return val;
        }

    }

    public static void main(String[] args) {
        Heap heap1 = new Heap();
        heap1.insertIntoHeap(1);
        heap1.insertIntoHeap(2);
        heap1.insertIntoHeap(4);
        heap1.insertIntoHeap(5);
        heap1.insertIntoHeap(3);
        // heap1.insertIntoHeap(1);
        // heap1.insertIntoHeap(7);
        // heap1.insertIntoHeap(11);
        // heap1.insertIntoHeap(9);
        // heap1.insertIntoHeap(3);
        // heap1.insertIntoHeap(0);
        // heap1.insertIntoHeap(100);
        // heap1.insertIntoHeap(55);
        // heap1.insertIntoHeap(53);
        // heap1.insertIntoHeap(31);
        heap1.printheap();
        System.out.println("peek = "+ heap1.peekFromHeap());
        heap1.printheap();
        // System.out.println(heap1.remove());
        // heap1.printheap();

    }
}
