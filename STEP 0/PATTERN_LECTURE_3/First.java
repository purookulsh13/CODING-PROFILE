/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
A
B C
C D E
D E F G

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 13

Sample Input 1:
5
Sample Output 1:
A
B C
C D E
D E F G
E F G H I

Sample Input 2:
6


Sample Output 2:
A
B C
C D E
D E F G
E F G H I
F G H I J K


 */

import java.util.Scanner;

class First{
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i+j)+" ");
            }
            System.out.println();
        }
        s.close();
    }
}

/*
 * Solution :   A
 *              B C
 *              C D E
 *          Logic : (char)('A'+i+j) is 
 *          1.  if i=0 loops run and enter and j loops it prints only A (Since i=0 and j=0 => 'A'+0+0 => 65+0+0 => 65 => A) and move to i loop (post increment so i=2) 
 *              Overall prints : A
 * 
 *          2.  now, i=1 loops run and enter and j loops it prints(Since i=1 and j=0 => 'A'+1+0 => 65+1+0 => 66 => B) and 
 *              move to j=1 loop  and it prints (Since i=1 and j=0 => 'A'+1+0 => 65+1+1 => 67 => C)
 *              (post increment so i=2)
 *              Overall prints : A
 *                               B C
 *      
 *           3.  now, i=2 loops run and enter and j=0 loops it prints(Since i=2 and j=0 => 'A'+2+0 => 65+2+0 => 67 => C) and 
 *               move to j=1 loop  and it prints (Since i=2 and j=1 => 'A'+2+1 => 65+2+1 => 68 => D)
 *               move to j=2 loop  and it prints (Since i=2 and j=2 => 'A'+2+1 => 65+2+2 => 69 => E)
 *              (post increment so i=2)
 *              Overall prints : A
 *                               B C
 *                               C D E
 * 
 *          and so on..............
 *
 */
