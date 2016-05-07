/**
 * 
 */
package com.tofek;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author tofek.khan
 *
 */
public class GemStone_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] a = {'a','b','c','d','d','e'};
		char[] b = {'b','a','c','c','d'};
		char[] c = {'e','e','a','b','g'};
		
		Set set = new HashSet();
		Set set1 = new HashSet();
		
		for(int i = 0; i<a.length;i++){
			set.add(a[i]);
		}
		int count = 0;
		Iterator itr = set.iterator();
		for(int j = 0; j<b.length;j++){
			if(!set.add(b[j])){
				for(int k = 0; k<c.length;k++){
					if(!set.add(c[k])){
						//count++;
						set1.add(c[k]);
						//break;
					}
				}
			}
		}
		
		System.out.println(set1.size());

	}

}
