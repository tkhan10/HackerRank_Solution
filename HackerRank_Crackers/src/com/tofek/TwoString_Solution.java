/**
 * 
 */
package com.tofek;

import java.util.Scanner;

/**
 * @author tofek.khan
 *
 */
public class TwoString_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();	

		for(int j = 0; j<t ; j++){
			boolean flag = false;
			String a = scan.next();			
			String b = scan.next();	

			char[] aChar = a.toCharArray();	
			
		
			for(int i = 0; i<aChar.length;i++){
				if(b.indexOf(aChar[i]) != -1){
					flag = true;
					break;
				}
			}
			if(flag){
				System.out.println("YES");	
			}else{
				System.out.println("NO");
			}
		}
	}
}
