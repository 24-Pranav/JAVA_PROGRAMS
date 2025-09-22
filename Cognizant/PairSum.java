package Cognizant;

import java.util.ArrayList;
import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int nums[] = { 5, 5 };
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int var1 = target - nums[i];

            if (map.containsKey(var1) && map.get(var1) != i) {
                list.add(i);
                list.add(map.get(var1));
                break;
            }
        }

        System.out.println(list);
    }
}
