import java.util.*;
public class priorityQueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(int rank , String name){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq1 = new PriorityQueue<>();
        pq1.add(new Student(11, "SubodhDhoke"));
        pq1.add(new Student(1, "alexa"));
        pq1.add(new Student(5, "marina"));
        pq1.add(new Student(6, "Bunny"));
        pq1.add(new Student(7,"Mady"));
        System.out.println(pq1);
        while(!pq1.isEmpty()){
            System.out.println(pq1.remove().name);
        }


        pq.add(3);
        pq.add(2);
        pq.add(5);
        pq.add(4);
        pq.add(1);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }

    }
}
