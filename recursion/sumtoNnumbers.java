/*
 * Find Sum of all the Numbers from 0 til N.
 */

import java.util.Scanner;


class sumtoNnumbers {
    static int sum(int n){
        if(n==0 || n==1)
            return n;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }


}