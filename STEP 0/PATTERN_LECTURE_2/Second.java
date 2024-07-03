/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC


Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26


Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG


Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF

 */
import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+i)+" ");
            }
            System.out.println();
            
        }
        s.close();
    }
}

/*
 * Solution : Ascii value of A is 65 and B is 66 and C is 67 and so on for the capital alphabets
 *             i as row, j as column
 *              Step 1 : enter first i loop for i=1 and then enter the j loop for j=1
 *                       so it prints first A
 *                       again j loops runs until i (for the first loop its 1)
 *                      so after compelting for i=1,j=1 it prints A
 *             
 *              Step 2 : enter first i loop for i=2 and then enter the j loop for j=1 
 *                       so it prints first A
 *                                          B
 *                       again j loops runs until i ( for second loop i=2) 
 *                      so after compelting for i=2,j=i it prints A
 *                                                                B B
 *              
 *              Step 3 : enter first i loop for i=3 and then enter the j loop for j=1
 *                       so it prints first A
 *                                          B B
 *                                          C
 *                       again j loops runs until i (for the third loop i=3) 
 *                      so after compelting for i=3,j=i it prints A
 *                                                                B B
 *                                                                C C C
 *             ....................
 *             .....................
 *              .....................
 *              continue..........
 *              .....................
 *              ....................
 */