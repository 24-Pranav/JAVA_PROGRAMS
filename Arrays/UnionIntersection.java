package Arrays;

import java.util.HashSet;

public class UnionIntersection {

    public static void union(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        System.out.println(result);
    }

    public static void intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);

        System.out.println(result);
    }

    public static void difference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> result = new HashSet<>(set1);
        result.removeAll(set2);

        System.out.println(result);
    }

    public static void main(String args[]) {
        HashSet<Integer> set1 = new HashSet<>();
        int arr1[] = { 2, 4, 5, 8, 12, 6 };

        HashSet<Integer> set2 = new HashSet<>();
        int arr2[] = { 5, 9, 2, 1, 5, 8 };

        for (int x : arr1) {
            set1.add(x);
        }

        for (int x : arr2) {
            set2.add(x);
        }

        union(set1, set2);
        intersection(set1, set2);
        difference(set1, set2);
    }
}
