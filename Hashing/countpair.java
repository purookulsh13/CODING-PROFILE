/*
Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j] 


 */

/*
Brute force Logic :
input(n)
input(k)
input(arr)
int cnt = 0;
for(int i=1;i<=n;i++){
	for(int j=i+1;j<=;j++){
		int difference = arr[i] - arr[j];
		if(difference == k){
			cnt++;	
		}	
	}	
}
print(cnt)
 */

import java.util.HashMap;
import java.util.Map;

public class countpair {    
    public static int countPairsOptimized(int[] b, int k) {
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int j = 0; j < b.length; ++j) {
            int target = b[j] + k;
            if (freqMap.containsKey(target)) {
                count += freqMap.get(target);
            }
            freqMap.put(b[j], freqMap.getOrDefault(b[j], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] b = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println("Count of pairs: " + countPairsOptimized(b, k));
    }
}

/*
 Optimised Approach:- Instead of Running 2 Nested For loops, 
 we will create a Hashmap to Store the Occurences of the Elements which we have encountered in the past. 
 At each index i, we will calculate the Required Element, = (arr[i]+k), we wil check if it is present in hashmap, 
 we will do cnt = cnt + freq[requiredElement].

 input(n)
input(k)
input(arr)

int cnt=0;

map<int, int> mp;

for(int i=1;i<=n;i++){
	int requiredElement = arr[i] + k;
	if(mp.find(requiredElement) != mp.end()){
		cnt = cnt + mp[requiredElement];
	}
	mp[arr[i]]++;
}
print(cnt)

 */

