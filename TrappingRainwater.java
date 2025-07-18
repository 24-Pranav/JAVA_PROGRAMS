public class TrappingRainwater {

    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // calculate left boundary
        int leftbound[] = new int[n];
        leftbound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftbound[i] = Math.max(height[i], leftbound[i - 1]);
        }

        // calculate right boundary
        int rightbound[] = new int[n];
        rightbound[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightbound[i] = Math.max(height[i], rightbound[i + 1]);
        }

        // calculate trapped water
        int trappedwater = 0;

        // loop
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftbound[i], rightbound[i]);

            trappedwater += waterlevel - height[i];
        }

        return trappedwater;

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total Trapped Rainwater is : " + trappedRainwater(height));
    }
}
