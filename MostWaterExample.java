public class MostWaterExample {

    public static int storeWater(int arr[]) {
        int maxWater = 0;

        // using brute force approach
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // int height = Math.min(arr[i], arr[j]);
        // int width = j - 1;
        // int currWater = height * width;

        // maxWater = Math.max(maxWater, currWater);
        // }
        // }

        // 2 pointer approach
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // calculate water area
            int height = Math.min(arr[start], arr[end]);
            int width = end - start;
            int currWater = height * width;

            maxWater = Math.max(maxWater, currWater);

            if (arr[start] < arr[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(storeWater(arr));
    }
}
