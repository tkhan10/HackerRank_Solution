/**
 * 
 */
package com.tofek;

import java.util.Scanner;

/**
 * @author tofek.khan
 *
 */
public class ModifiedKaprekarNumbers_Solution {

	/**
	 * @param args
	 * 
	 * A modified Kaprekar number is a positive whole number nn with dd digits, such that when we split its square into two pieces - a right hand piece rr with dd digits and a left hand piece ll that contains the remaining dd or d−1d−1 digits, the sum of the pieces is equal to the original number (i.e. ll + rr = nn).

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!): In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

The Task 
You are given the two positive integers pp and qq, where pp is lower than qq. Write a program to determine how many Kaprekar numbers are there in the range between pp and qq (both inclusive) and display them all.

Input Format

There will be two lines of input: pp, lowest value qq, highest value

Constraints: 
0<p<q<1000000<p<q<100000
Output Format

Output each Kaprekar number in the given range, space-separated on a single line. If no Kaprekar numbers exist in the given range, print INVALID RANGE.

Sample Input

1
100
Sample Output

1 9 45 55 99

Explanation

11, 99, 4545, 5555, and 9999 are the Kaprekar Numbers in the given range.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int p = scan.nextInt();
		int q = scan.nextInt();
		String result1 = "";
		boolean flag = false;
		for(long i = p; i<=q; i++){
			
			long a = i*i;
			
			int aa =String.valueOf(a).length();
			int raiseToPow = aa-(aa/2);
						
			long aaa = (int)Math.pow(10, raiseToPow);
			long bb = a/aaa+a%aaa;
			
			if(bb == i){
				System.out.print(i+" ");								
			}			
			
		}
		if(!flag){
			System.out.println("INVALID RANGE");
		}

	}
	/**
	 * Cases which is failed
	 * Case 1 : 
	 * input : 1 99999
	 * output: 1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344 22222 77778 82656 95121 99999
	 */

}
