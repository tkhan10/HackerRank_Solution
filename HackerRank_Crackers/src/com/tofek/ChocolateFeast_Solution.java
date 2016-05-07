/**
 * 
 */
package com.tofek;

import java.util.Scanner;


/**
 * @author tofek.khan
 *
 */
public class ChocolateFeast_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();

			long a = n/c;
			long b = a/m;
			if(c>=2 && c<= n){
				if(m>= 2 && m<= n){
					if(m<=a && a%m != 0){

						a = a+a%m;
						a =a+b;
					}else{
						a = a+a/m;
					}
				}
			}
			System.out.println(a);
		}
		// 16779 1 5886
		/*int n = 6;//in.nextInt();
		int c = 2;//in.nextInt();
		int m = 2;//in.nextInt();
		
		int a = n/c;
		int b = a/m;
		if(c>=1 && c<= n){
			if(m>= 2 && m<= n){
				if(m<a ){
                    if(a%m != 0){
                    	a = a+a/m;
                    }else{
                    	a = a+a/m;
                    	a =a+b;
                    }
					
					
				}else{
					a = a+a/m;
				}
			}
		}
		System.out.println(a);
	}*/
	}

}
