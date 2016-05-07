/**
 * 
 */
package com.tofek;

import java.util.Scanner;

/**
 * @author tofek.khan
 *
 */
public class VeryBigSum_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();            
        }*/
		
		/*long[] arr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long sum = 0;
        for(long a : arr){
        	sum = sum+a;
        }*/
        
		double d = 1;
		String formattedString = String.format("%.07f", d);
        System.out.println(formattedString);

	}

}
