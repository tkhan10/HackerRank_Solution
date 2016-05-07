/**
 * 
 */
package com.tofek;

import java.util.Scanner;

/**
 * @author tofek.khan
 *
 *
 *You are given NN sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following: 
3 2 2 6

The above step is repeated until no sticks are left.

Given the length of NN sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format 
The first line contains a single integer NN. 
The next line contains NN integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format 
For each operation, print the number of sticks that are cut, on separate lines.

Constraints 
1 ≤ N ≤ 1000 
1 ≤ ai ≤ 1000

Sample Input #00

6
5 4 4 2 2 8
Sample Output #00

6
4
2
1
Sample Input #01

8
1 2 3 4 3 3 2 1
Sample Output #01

8
6
4
1
 */
public class CutTheSticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();            
        }	
        
        for(int j=0; j<arr.length;j++){
			int b = findMinimum(arr);
			int count = 0;
			if(b != 0){
			for(int i =0; i<arr.length;i++){
				if(arr[i] != 0){
					arr[i] = arr[i]-b;
					count++;
				}
			}
			}
			
			if(count>0){
				System.out.println(count);
			}			
		}		
	}

	private static int findMinimum(int[] array) {
		int t = 0 ;
		for(int i = 0; i<array.length;i++){
			if(array[i]!=0){
				t = array[i];
				break;
			}
		}
		for(int i = 0; i<array.length;i++){
			if(array[i]<t && array[i]>0){
				t = array[i];				
			}
		}
		return t;
	}

}
