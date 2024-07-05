/*
 * We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.

 * 
 */
import java.util.*;

class maxandminfreq{
    public static void main(String[] args) {
        // int n = 6;
        int[] arr = {1, 1, 2, 3, 3, 3};

        Map<Integer, Integer> mp = new HashMap<>();
        int maxiFreq = Integer.MIN_VALUE, maxiElement = arr[0];
        int miniFreq = Integer.MAX_VALUE, miniElement = arr[0];

        // Calculate frequencies
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Find elements with maximum and minimum frequency
        for (Map.Entry<Integer, Integer> num : mp.entrySet()) {
            if (num.getValue() > maxiFreq) {
                maxiFreq = num.getValue();
                maxiElement = num.getKey();
            }
            if (num.getValue() < miniFreq) {
                miniFreq = num.getValue();
                miniElement = num.getKey();
            }
        }

        System.out.println("Max frequency element: " + maxiElement + " with frequency: " + maxiFreq);
        System.out.println("Min frequency element: " + miniElement + " with frequency: " + miniFreq);
    }
}



 