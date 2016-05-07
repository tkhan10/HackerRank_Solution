/**
 * 
 */
package com.tofek;

import java.util.Scanner;



/**
 * @author tofek.khan
 *
 *Given an integer, NN, traverse its digits (dd1,dd2,...,ddn) and determine how many digits evenly divide NN (i.e.: count the number of times NN divided by each digit ddi has a remainder of 00). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for N=111N=111, the answer is 33).

Input Format

The first line is an integer, TT, indicating the number of test cases. 
The TT subsequent lines each contain an integer, NN.

Constraints 
1≤T≤151≤T≤15 
0<N<1090<N<109
Output Format

For every test case, count and print (on a new line) the number of digits in NN that are able to evenly divide NN.

Sample Input

2
12
1012
Sample Output

2
3
Explanation

The number 1212 is broken into two digits, 11 and 22. When 1212 is divided by either of those digits, the calculation's remainder is 00; thus, the number of evenly-divisible digits in 1212 is 22.

The number 10121012 is broken into four digits, 11, 00, 11, and 22. 10121012 is evenly divisible by its digits 11, 11, and 22, but it is not divisible by 00 as division by zero is undefined; thus, our count of evenly divisible digits is 33.
 */
public class FindDigits_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();        
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count = 0;
            int number = n;
            while(n/10>0){ 
    			int ab = n%10;
    			if(ab == 0){
    				n = n/10;
    				continue;
    			}
    			if(ab>0 && number%ab == 0 ){
    				count++; 
    				n = n/10;
    			}else{
    				n = n/10;
    			}
    		}
            System.out.println(count+1);
        }

	}

}
