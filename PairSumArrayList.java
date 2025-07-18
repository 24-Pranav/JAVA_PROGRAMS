import java.util.ArrayList;

public class PairSumArrayList {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            if (list.get(start) + list.get(end) == target) {
                return true;
            }

            if (list.get(start) + list.get(end) < target) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.err.println(pairSum(list, target));
    }
}
