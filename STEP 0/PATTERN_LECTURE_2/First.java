/*
 * Question 1.
for n=3     
pattern is 
1
2 2
3 3 3

for n=5
pattern is 
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

now print for n=6!!

 */

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        s.close();
    }
}

/*
 * Solution : 
 *              i as row, j as column
 *              Step 1 : enter first i loop for i=1 and then enter the j loop for j=1
 *                       so it prints first 1
 *                       again j loops runs until i (for the first loop its 1)
 *                      so after compelting for i=1,j=1 it prints 1
 *             
 *              Step 2 : enter first i loop for i=2 and then enter the j loop for j=1 
 *                       so it prints first 1
 *                                          2
 *                       again j loops runs until i ( for second loop i=2) 
 *                      so after compelting for i=2,j=i it prints 1
 *                                                                2 2
 *              
 *              Step 3 : enter first i loop for i=3 and then enter the j loop for j=1
 *                       so it prints first 1
 *                                          2 2
 *                                          3
 *                       again j loops runs until i (for the third loop i=3) 
 *                      so after compelting for i=3,j=i it prints 1
 *                                                                2 2
 *                                                                3 3 3
 *               
 *        
 *               Step 6 : enter first i loop for i=4 and then enter the j loop for j=1
 *                       so it prints first 1
 *                                          2 2
 *                                          3 3 3
 *                                          4
 *                       again j loops runs until i 
 *                      so after compelting for i=4,j=i it prints 1
 *                                                                2 2
 *                                                                3 3 3
 *                                                                4 4 4 4
 */