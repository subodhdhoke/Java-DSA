import java.util.*;

public class nearbyCars {
    public static class CarLocation implements Comparable<CarLocation>{
        int x;
        int y;
        int disSquare;
        int idx;
        CarLocation(int x , int y , int idx){
            this.idx = idx;
            this.x = x;
            this.y = y;
            this.disSquare = (x*x)+(y*y);
        }
        @Override
        public int compareTo(CarLocation c2){
            return this.disSquare - c2.disSquare;
        }
    }
    public static void main(String[] args) {
        int[][] pts = { { 3, 3 },
                        { 5, -1 },
                        { -2, 4 } };
        int k=2;
        PriorityQueue<CarLocation> pq = new PriorityQueue<>();
        for(int i=0 ; i<pts.length ; i++){
            pq.add(new CarLocation(pts[i][0], pts[i][1], i));
        }
        for(int i =0 ; i<k ; i++){
            System.out.println("C"+pq.remove().idx);
        }

        
    }
}
