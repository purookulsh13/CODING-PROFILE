/*
 * Print the following pattern for the given N number of rows.

The dots represent spaces.
Input format :
Integer N (Total no. of rows)


Output format :
Pattern in N lines


Constraints
0 <= N <= 50


Sample Input 1:
3
Sample Output 1:
     1 
    12
  123


Sample Input 2:
4
Sample Output 2:
     1 
    12
  123
1234

 */

import java.util.Scanner;

class first{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        s.close();
    }
}

/*
 * Solution : 
 *               Step 1 : Row 0 (i = 0):
 *                        Spaces: n - i - 1 = 4 - 0 - 1 = 3 spaces.
 *                        Numbers: i + 1 = 0 + 1 = 1 number.
 *                        Print : 1
 * 
 *              Step 2 :     Row 1 (i = 1):
 *                           Spaces: n - i - 1 = 4 - 1 - 1 = 2 spaces.
 *                           Numbers: i + 1 = 1 + 1 = 2 numbers.
 *                           Print: 1 2
 * 
 * 
 * 
 * 
 */