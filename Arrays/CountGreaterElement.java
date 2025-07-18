package Arrays;

public class CountGreaterElement {
    public static void main(String[] args) {

        int arr[] = { 3, 4, 5, 8, 9 };

        int max = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                count++;
                max = Math.max(max, arr[i]);
            }
        }
        System.out.println(count);
    }
}
