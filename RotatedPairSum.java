import java.util.ArrayList;

public class RotatedPairSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size() - 1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int start = bp + 1;
        int end = bp;

        while (start != end) {
            if (list.get(start) + list.get(end) == target) {
                return true;
            }

            if (list.get(start) + list.get(end) < target) {
                start = (start + 1) % n;
            } else {
                end = (n + end - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum(list, target));
    }
}
