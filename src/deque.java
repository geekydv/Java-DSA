import java.util.Deque;
import java.util.LinkedList;

public class deque {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addFirst(2);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.removeFirst());

        System.out.println(dq.isEmpty());

        System.out.println(dq.size());
    }

}
