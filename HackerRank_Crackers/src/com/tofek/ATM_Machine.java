/**
 * 
 */
package com.tofek;

import java.util.Scanner;

/**
 * @author tofek.khan
 *
 * Question: in the ATM Machine there are only 10,5,2,1 rupees note. user enters amount whitch they want to dispatch and 
 * number of notes available in ATM Machine. you need to fine Minimum number of note should be dispatch and user withdraw the amount
 * Input Data
 * 16 1 2 3 4 (16 = amount, 1 = 10 Rs, 2 = 5 Rs, 3 = 2 Rs, 4 = 1 Rs Note)
 * 
 * Output Data
 * 10 - 1, 5 - 1, 1 - 1 (10 Rs = 1 Note, 5 Rs = 1 note, 1 Rs = 1 Note)
 */
public class ATM_Machine {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
	int [] a =	{10,5,2,1};
	int[] count = new int[4];
	
	int amount = 18;
	int b = amount;
		
	for(int i = 0; i<a.length;i++){
		/*if(b%a[i]== 0){
			abc  = b/a[i];
			break;		
		}*/
		if(b / a[i]>0){
			b = b%a[i];
			count[i] = a[i];
		}
		
	}
	/*if(abc >0){
	for(int i = 0; i<abc; i++){
		count[i] = a[i];
	}
	}*/
	for(int i = 0; i<count.length;i++){
		if(count[i] != 0){
		System.out.println(count[i]);
		}
		}
	}
	
}
