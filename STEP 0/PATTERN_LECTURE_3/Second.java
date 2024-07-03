/*
 * Q2.Print the following pattern for the given number of rows.
Pattern for N = 5
E
D E
C D E
B C D E
A B C D E

Input format :
N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26


Sample Input 1:
8
Sample Output 1:
H
G H
F G H
E F G H
D E F G H
C D E F G H
B C D E F G H
A B C D E F G H


Sample Input 2:
7
Sample Output 2:
G
F G
E F G
D E F G
C D E F G
B C D E F G
A B C D E F G

find for n=10

 */

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        // char c = (char)('A'+n-1);
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                System.out.print((char)('A'+(n-1)-j)+" ");
            }
            System.out.println();
        }
        s.close();
    }
}


/*
*    E                     =>A+n-1
*    D E                   =>(A+(n-1)-2) (A+n-1-1)
*    C D E
*    B C D E
*    A B C D E   
                logic : 'A'+(n-1)-j

        (n - 1) - j calculates the offset from 'A' for each position. As j decreases, the character printed moves earlier in the alphabet.
 */