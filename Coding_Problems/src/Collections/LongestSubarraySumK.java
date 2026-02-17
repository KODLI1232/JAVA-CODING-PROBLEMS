package Collections;

import java.util.*;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Case 1: Subarray from index 0
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: sum - k found before
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence only
            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 1, 1, 1};
        int K = 3;

        System.out.println(longestSubarray(A, K)); // Output: 4
    }
}
