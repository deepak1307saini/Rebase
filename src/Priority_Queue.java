import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.offer(34);
        pq.offer(23);
        pq.offer(45);
        pq.offer(12);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        //Max heap
        PriorityQueue<Integer> maxPq=new PriorityQueue<>(Comparator.reverseOrder());

        maxPq.offer(34);
        maxPq.offer(23);
        maxPq.offer(45);
        maxPq.offer(12);

        System.out.println(maxPq);
        maxPq.poll();
        System.out.println(maxPq);

        System.out.println(maxPq.peek());

    }
}
