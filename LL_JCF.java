import java.util.LinkedList;

public class LL_JCF {
    public static void main(String[] args) {
        // create - objects (Integer,Character,String)
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.err.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();

        System.err.println(ll);
    }
}
