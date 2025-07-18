import java.util.HashMap;

public class SubArrayXOR {
    public long subarrayXor(int arr[], int k) {
        int xor = 0;
        int ans = 0;

        HashMap<Integer, Integer> nm = new HashMap<>();

        for (int x : arr) {
            xor = xor ^ x;
            if (xor == k) {
                ans++;
            }
            ans += nm.getOrDefault((int) (xor ^ k), 0);
            nm.put((int) xor, nm.getOrDefault((int) xor, 0) + 1);
        }
        return ans;
    }
}
