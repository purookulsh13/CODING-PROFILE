/*  1.create  the given pattern 
 000000
 000000
 000000
 000000

*/

public class First {
    public static void main(String[] args) {
        for(int i = 1; i <=4; i++) {
            for(int j = 1; j <= 6; j++) {  
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
 *                       again j loops runs until 6 
 *                      so after compelting for i=1,j=6 it prints 000000
 *             
 *              Step 2 : enter first i loop for i=2 and then enter the j loop for j=1
 *                       so it prints first 000000
 *                                          0
 *                       again j loops runs until 6 
 *                      so after compelting for i=2,j=6 it prints 000000
 *                                                                000000
 *              
 *              Step 3 : enter first i loop for i=3 and then enter the j loop for j=1
 *                       so it prints first 000000
 *                                          000000
 *                                          0
 *                       again j loops runs until 6 
 *                      so after compelting for i=4,j=6 it prints 000000
 *                                                                000000
 *                                                                000000
 *               
 *        
 *               Step 4 : enter first i loop for i=6 and then enter the j loop for j=1
 *                       so it prints first 000000
 *                                          000000
 *                                          000000
 *                                          0
 *                       again j loops runs until 6 
 *                      so after compelting for i=4,j=6 it prints 000000
 *                                                                000000
 *                                                                000000
 *                                                                000000
 */