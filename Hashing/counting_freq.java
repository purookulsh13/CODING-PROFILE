/*
Counting frequencies of array elements
Last Updated : 03 Oct, 2023
Given an array which may contain duplicates, print all elements and their frequencies.

Examples: 

Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1

Input : arr[] = {10, 20, 20}
Output : 10 1
         20 2 
 */

import java.util.*;

public class counting_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] hash = new int[n];
        int k=0;
        while(k<n){
            int t = arr[k];     
            hash[t]++;          
            k++;
        }

        for(int j=0;j<n;j++){
            if(hash[j]==0)
                continue;
            System.out.println(arr[j]+" "+hash[j]);
        }

        sc.close();
    }
}
