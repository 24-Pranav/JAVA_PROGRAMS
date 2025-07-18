public class EquilibriumPoint {

    public static int findEquilibrium(int arr[]) {

        int right = 0;
        int left = 0;

        for (int i = 0; i < arr.length; i++) {
            right += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            right -= arr[i];
            if (left == right) {
                return i;
            } else {
                left += arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(findEquilibrium(arr));
    }
}