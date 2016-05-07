/**
 * 
 */
package com.tofek;

import java.util.Scanner;

/**
 * @author tofek.khan
 *
 */
public class FunnyString_Solution {

	/**
	 * @param args
	 * 
	 * Suppose you have a String, SS, of length NN that is indexed from 00 to N−1N−1. You also have some String, RR, that is the reverse of String SS. SS is funny if the condition |S[i]−S[i−1]|=|R[i]−R[i−1]||S[i]−S[i−1]|=|R[i]−R[i−1]| is true for every character ii from 11 to N−1N−1.

Note: For some String SS, S[i]S[i] denotes the ASCII value of the ithith 00-indexed character in SS. The absolute value of an integer, xx, is written as |x||x|.

Input Format

The first line contains an integer, TT (the number of test cases). 
Each line ii of the TT subsequent lines contain a string, SS.

Constraints

1≤T≤101≤T≤10
0≤i≤T−10≤i≤T−1
2≤length of S≤100002≤length of S≤10000
Output Format

For each String SjSj (where 0≤j≤T−10≤j≤T−1), print whether it is FunnyFunny or Not FunnyNot Funny on a new line.

Sample Input

2
acxz
bcxz
Sample Output

Funny
Not Funny
Explanation

Test Case 0: S="acxz"S="acxz" 
|c−a|=2=|x−z||c−a|=2=|x−z| 
|x−c|=21=|c−x||x−c|=21=|c−x| 
|z−x|=2=|a−c||z−x|=2=|a−c| 
As each comparison is equal, we print FunnyFunny.

Test Case 1: S="bcxz"S="bcxz" 
|c−b|=1|c−b|=1, but |x−z|=2|x−z|=2 
At this point, we stop evaluating SS (as |c−b|≠|x−z||c−b|≠|x−z|) and print Not FunnyNot Funny.
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int j = 0; j<t; j++){
			String in = scan.next();
			char[] charString = in.toLowerCase().toCharArray();
			int  count = 0;

			for(int i = 0; i<charString.length-1;i++){

				int a = Math.abs((int)charString[i]-(int)charString[i+1]);
				int b = Math.abs((int)charString[charString.length-i-1] - (int)charString[charString.length-i-2]);
				if(a == b){
					count++;
				}

			}

			if(count == charString.length-1){
				System.out.println("FUNNY");
			}else{
				System.out.println("Not Funny");
			}
		}

	}

}
