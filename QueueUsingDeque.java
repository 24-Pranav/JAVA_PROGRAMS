import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

    static class Queue {
        static Deque<Integer> deque = new LinkedList<>();

        // add
        public static void add(int data) {
            deque.addLast(data);
        }

        // remove
        public static int remove() {
            return deque.removeFirst();
        }

        // peek
        public static int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek() + " ");
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
