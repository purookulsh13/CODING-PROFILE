/*
 *  Find Sum of Range  [l……….r] where(l<=r) using Prefix sum. 
 */

 /*
  * Brute Force:- For each l and r, start our i pointer from l and i will go till r and for each i, we will update our sum by doing sum = sum + arr[i]. 
    Finally, print this sum.

input(n)//n is size of the array
input(q)//l is lower index and r is higher index and we find sum of [l.....r]
input(arr)
 
int getSum(int l, int r){
	int sum = 0;
	for(int i=l;i<=r;i++){
		sum = sum + arr[i];
	}
	return sum; 
}

for(int i=0;i<q.size();i++){
	int current_l = q[i][0], current_r = q[i][1];
	print(getSum(current_l, current_r));
}

  */
public class sumofrange_prefixsum {
    static int[] prefixSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i - 1] + nums[i-1];
        }
        return prefix;
    }
 
    static int optimizedSum(int[] prefix, int l, int r) {
        return prefix[r+1] - prefix[l];
    }
 
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] prefix = prefixSum(nums);
 
        int l = 3, r = 7; // Example range [l, r]
        System.out.println("Optimized Sum: " + optimizedSum(prefix, l, r));
    }
}

/*
intput(n)
input(arr)
 
int prefix[n]
//prefix[i] = sum of [1 .... i] index elements
 
//creating prefix array
 
for(int i=1;i<=n;i++){
	prefix[i] = prefix[i-1] + arr[i];
}
int l,r;
input(l, r);
 
print("sum of elements from range l till r = ", prefix[r] - prefix[l-1]);

 * 
 * 
 * 1. prefix[i] = prefix[i - 1] + nums[i - 1]; : This line computes the current prefix sum as the sum of the previous prefix sum (prefix[i - 1]) 
 * and the corresponding element in the input array (nums[i - 1]).
 * 
 * 
 * 2. return prefix[r + 1] - prefix[l]; : This line returns the sum of elements in the range [l, r]. 
 * It calculates the difference between the prefix sum at index r + 1 and the prefix sum at index l.
 * 
 * 
 */