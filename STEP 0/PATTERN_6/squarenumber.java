/*
Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n and asked him to build a pattern.
Help Geek to build the pattern.

https://www.geeksforgeeks.org/problems/square-pattern-1662666141/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_22

Example 1:

Input: 4

Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4


 */

import java.util.Scanner;

class squarenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = (n*2)-1; 
        int s = 0;
        int t=n;
        int[][] arr = new int[g][g];

        while(t!=0){
            for(int i=s;i<g;i++){
                for(int j=s;j<g;j++){
                    arr[i][j] = t;
                }
            }
            s++;
            g--;
            t--;
        }

        for(int i=0;i<(n*2)-1;i++){
            for(int j=0;j<(n*2)-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
           sc.close();
    }
}

/*
 * Solution :   g = (n * 2) - 1     the size of the grid
 *              s = 0               Initialize the starting index for layers
 * 
 *              t=n so while loops untill t=0
 *              First loop for t= 4
 *              outermost layer (indices 0 to 6) with 4.
 *              s++: Move to the next inner layer (s = 1).
 *               g--: Reduce the size of the grid for the next layer (g = 6).
 *               t--: Decrease the value to be filled (t = 3). 
 *                      4 4 4 4 4 4 4
 *                      4           4
 *                      4           4
 *                      4           4
 *                      4           4
 *                      4           4
 *                      4 4 4 4 4 4 4
 *              Second loop for t=3
 *                  Fill the next inner layer (indices 1 to 5) with 3.  
 *               s++: Move to the next inner layer (s = 2).
 *               g--: Reduce the size of the grid for the next layer (g = 5).
 *               t--: Decrease the value to be filled (t = 2).
 *                  
 *                      4 4 4 4 4 4 4
 *                      4 3 3 3 3 3 4
 *                      4 3       3 4
 *                      4 3       3 4
 *                      4 3       3 4
 *                      4 3 3 3 3 3 4
 *                      4 4 4 4 4 4 4
 * 
 *              continue...........
 *              ...................
 *              ...................
 *              ..................
 */