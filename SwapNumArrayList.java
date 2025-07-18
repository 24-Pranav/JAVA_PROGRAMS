import java.util.ArrayList;

public class SwapNumArrayList {

    public static void swap(ArrayList<Integer> list, int ind1, int ind2) {
        int temp = list.get(ind1);

        list.set(ind1, ind2);
        list.set(ind2, temp);

        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int index1 = 1;
        int index2 = 3;

        System.out.println(list);

        swap(list, index1, index2);
    }
}
