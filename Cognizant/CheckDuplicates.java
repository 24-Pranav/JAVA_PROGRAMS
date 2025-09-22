package Cognizant;

import java.util.HashSet;

class CheckDuplicates {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                System.out.println("True");
                return;
            } else {
                set.add(nums[i]);
            }
        }
        System.out.println("False");
    }
}