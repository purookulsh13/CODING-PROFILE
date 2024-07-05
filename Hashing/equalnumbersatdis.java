/*
 * Check if there are any two Equal numbers in an array at a distance less than or equal to k
 */

/*
Logic : *BRUTE FORCE*
input(n)
input(arr)
 
input(k)
 
bool check(){
	for(int i=1;i<=n;i++){
		for(int j=i+1;j<=n && j<=i+k;j++){
			if(arr[i] == arr[j]){
				print("YES, We found a Valid Pair");
				return true;
			}
		}
	}
	return false;
 
}
 */

import java.util.*;

public class equalnumbersatdis {
     public static boolean containsNearbyDuplicateOptimized(int[] nums, int k) {
        Map<Integer, Integer> numIndices = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (numIndices.containsKey(nums[i]) && i - numIndices.get(nums[i]) <= k) {
                return true;
            }
            numIndices.put(nums[i], i);
        }
        return false;
    }
 
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 1, 2, 3};
        int k = 2;
        
        if (containsNearbyDuplicateOptimized(nums, k)) {
            System.out.println("There are two equal numbers within distance " + k);
        } else {
            System.out.println("No two equal numbers found within distance " + k);
        }   // to check the indexes of to equal number at k distance  (boolean result)
        
        equalnumbersatkdistance(nums, k); // to find the indexes of to equal number at k distance
        
    }

    public static void equalnumbersatkdistance(int[] nums,int k){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]) && i-mp.get(nums[i])<=k){
                System.out.println(mp.keySet()+" , "+mp.values());
                System.out.println("Pair of indexes are "+i+" and "+mp.keySet());
            }
            mp.put(nums[i],i);
        }

    }
}

