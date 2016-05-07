/**
 * 
 */
package com.tofek;

import java.util.Date;
import java.util.Scanner;

/**
 * @author tofek.khan
 *
 *Watson gives two integers (AA and BB) to Sherlock and asks if he can count the number of square integers between AA and BB (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format 
The first line contains TT, the number of test cases. TT test cases follow, each in a new line. 
Each test case contains two space-separated integers denoting AA and BB.

Output Format 
For each test case, print the required answer in a new line.

Constraints 
1≤T≤1001≤T≤100 
1≤A≤B≤1091≤A≤B≤109

Sample Input

2
3 9
17 24
Sample output

2
0
Explanation 
Test Case #00: In range [3,9][3,9], 44 and 99 are the two square numbers. 
Test Case #01: In range [17,24][17,24], there are no square numbers.
 */
public class SherlockAndSquares_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
	
        int arr[] = new int[t];
        for(int arr_i=0; arr_i < t; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
       /* for(int i=0; i < arr.length; i++){
        	System.out.println(arr[i]);
        }*/
        
		/*int p = in.nextInt();
		int q = in.nextInt();
		if(t>= 1 && t<= 100){
			for(int i = 0; i<t;i++){
				int count = 0;
				long A = in.nextInt();
				long B = in.nextInt();
				long A =p;
				long B =q;

				for(double j=1; j<=B/2;j++){
					if((j*j >= A && j*j <= B)){
						count++;
					}
				}

				System.out.println(count);
			}
		}
*/

		//int t = 2;
		/*if(t>= 1 && t<= 100){

			for(int i = 0; i<t;i++){
				int count = 0;
				int a = in.nextInt();
				//int b = in.next();
				int b = 1;

				long A =a;
				long B =b;

				for(double j=1; j<=B/2;j++){
					if((j*j >= A && j*j <= B)){
						count++;
					}
				}

				System.out.println(count);
			}
		}*/
			
	}

}
