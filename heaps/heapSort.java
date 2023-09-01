import java.util.*;
import java.util.ArrayList;

public class HeapSort {
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
            swap(0, heap.size() - 1); // swap
            int val = heap.remove(heap.size() - 1); // remove
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

    public static void heapSort(int[] arr) {
        Heap h1 = new Heap();
        for (int i = 0; i < arr.length; i++) {
            h1.insertIntoHeap(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = h1.remove();
            System.out.print(arr[i] + " ");
        }
    }
    public static void heapSortUsingPQ(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0 ; i<arr.length ; i++){
            pq.add(arr[i]);
        }
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = pq.remove();
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, 3, 9, 2 };
        heapSort(arr);
        System.out.println();
        heapSortUsingPQ(arr);

    }
}
