// import java.util.*;

class hashing{
    public static void main(String[] args) {
       int arr[] = {1,3,1,3,3}; 
       int n = arr.length;
       int[] hash = new int[n];
       int i=0;
       while(i<n){
        int t = arr[i];
        hash[t]++;
        i++;
       }
       for(int k : hash)
        System.out.print(k+" ");
    }

}