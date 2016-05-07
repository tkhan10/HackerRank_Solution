/**
 * 
 */
package com.tofek;

/**
 * @author tofek.khan
 *
 */
public class EncryptionString_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String in = "feedthedog";
		
		int length = String.valueOf(in).length();
		System.out.println(length);
		
		char[] charArray = in.toCharArray();
		int b = 0;
		int a = 0;
		for(int i = 1; i<length ; i++){
			if(length%i == 0){
				b = i;
				a = length/i;
				if(a<=b){
					break;
				}
			}
		}
		System.out.println(a+"==="+b);
		
		

	}

}
