import java.util.LinkedList;
import java.util.Queue;

public class queueEx {
    public static void main(String[] args) {

        Queue<Integer> queue=new LinkedList<>();

        queue.offer(12);  //add() for same
        queue.offer(34);

        System.out.println(queue);
        System.out.println(queue.poll()); //same remove()

        System.out.println(queue);

        System.out.println(queue.peek());//element()
    }

}
