/*
 * 2.create the given pattern 
    0
    00
    000
    0000
 */
public class Second {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
            System.out.print(0);  
            }
            System.out.println();
        }
    }
}


/*
 * Solution : 
 *              i as row, j as column
 *              Step 1 : enter first i loop for i=1 and then enter the j loop for j=1
 *                       so it prints first 0
 *                       again j loops runs until i (for the first loop its 1)
 *                      so after compelting for i=1,j=1 it prints 0
 *             
 *              Step 2 : enter first i loop for i=2 and then enter the j loop for j=1 
 *                       so it prints first 0
 *                                          0
 *                       again j loops runs until i ( for second loop i=2) 
 *                      so after compelting for i=2,j=i it prints 0
 *                                                                00
 *              
 *              Step 3 : enter first i loop for i=3 and then enter the j loop for j=1
 *                       so it prints first 0
 *                                          00
 *                                          0
 *                       again j loops runs until i (for the third loop i=3) 
 *                      so after compelting for i=3,j=i it prints 0
 *                                                                00
 *                                                                000
 *               
 *        
 *               Step 6 : enter first i loop for i=4 and then enter the j loop for j=1
 *                       so it prints first 0
 *                                          00
 *                                          000
 *                                          0
 *                       again j loops runs until i 
 *                      so after compelting for i=4,j=i it prints 0
 *                                                                00
 *                                                                000
 *                                                                00000
 */

