/**
 * 
 */
package com.tofek;

import java.util.Scanner;

/**
 * @author tofek.khan
 *
 */
public class LoveLetterMystery {

	/**
	 * @param args
	 * James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

Input Format

The first line contains an integer TT, i.e., the number of test cases. 
The next TT lines will contain a string each. The strings do not contain any spaces.

Constraints 
1≤T≤101≤T≤10 
1≤1≤ length of string ≤104≤104 
All characters are lower case English letters.

Output Format

A single line containing the number of minimum operations corresponding to each test case.

Sample Input

4
abc
abcba
abcd
cba
Sample Output

2
0
4
2
Explanation

For the first test case, abc -> abb -> aba.
For the second test case, abcba is already a palindromic string.
For the third test case, abcd -> abcc -> abcb -> abca = abca -> abba.
For the fourth test case, cba -> bba -> aba.

	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();		

		String arr[] = new String[t];
		for(int arr_i=0; arr_i < t; arr_i++){
			arr[arr_i] = in.next();
			
		}	
			
			for(int i=0; i<arr.length;i++){
				int count = 0;
				String input = arr[i];

				char[] charString = input.toCharArray();

				for(int j=0; j<charString.length/2;j++){
					if(charString[j] == charString[charString.length-1-j]){
						continue;
					}else{

						int initial = (int)charString[j];
						int end = (int)charString[charString.length-1-j];
						int diff =end - initial;
						count = count+Math.abs(diff);
					}
				}
				System.out.println(count);
			}

	}

}
