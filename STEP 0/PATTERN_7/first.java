/*
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4
The dots represent spaces.
Input Format :
A single integer : N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3

Sample Output 1 :
***
 ***
  ***

Sample Input 2 :
5

Sample Output 2 :
*****
 *****
  *****
   *****
    *****

 */
import java.util.*;
public class first {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        s.close();
    }
}

/*
 * Solution :
 *              Let's take n=3
 *              Step 1 : first loop init i=1
 *                       then first nested j loop runs for j=1 to j<1 (where i=1,n=3)
 *                       so it didn't print anything
 *                       then second nested j loop runs for j=1 to j<n (where i=1.n=3)
 *                       so it print * * *
 * 
 *             Step 2 : Now loop i=2 init
 *                       then first nested j loop runs for j=1 to j<1 (where i=2,n=3)
 *                       so it prints only 1 space * * *
 *                                                 ()
 *                       then second nested j loop runs for j=1 to j<n (where i=2.n=3)
 *                       so it print * * *
 *                                     * * *
 * 
 *             Step 3 : Now loop i=3 init
 *                       then first nested j loop runs for j=1 to j<1 (where i=3,n=3)
 *                       so it prints only 1 space * * *
 *                                                   * * *
 *                                                () ()
 *                       then second nested j loop runs for j=1 to j<n (where i=3.n=3)
 *                       so it print * * *
 *                                     * * *
                                         * * *
*/