import java.util.PriorityQueue;

public class ConnectNropes {
    public static int connectNropes(int[] ropes){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i<ropes.length ; i++){
            pq.add(ropes[i]);
        }
        int cost = 0;
        while(pq.size() != 1){
            int min = pq.remove();
            int min2 = pq.remove();
            int currcost = min+min2;
            cost += currcost;
            pq.add(currcost);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] ropes = { 2, 3, 3, 4,6 };
        System.out.println(connectNropes(ropes));
        

    }
}
