public class PossibleTriangles {

    public static void main(String[] args) {
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int count = 0;
        for (int i = arr.length - 1; i >= 2; i--) {
            int start = 0;
            int end = i - 1;

            while (start < end) {
                if (arr[start] + arr[end] > arr[i]) {
                    count += end - start;
                    end--;
                } else {
                    start++;
                }
            }
        }
        System.out.println("Number of Possible Triangles = " + count);
    }
}
