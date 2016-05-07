/**
 * 
 */
package com.tofek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author tofek.khan
 *
 */
public class LarrysArray_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int a0 = 0; a0<t;a0++){
			int size = in.nextInt();
			int[] array = new int[size];
			boolean flag = false;		
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> list1 = new ArrayList<Integer>();
			for(int a1 = 0; a1<size; a1++){
				array[a1] = in.nextInt();
			}
			for(int a :array){
				list.add(a);
				list1.add(a);
			}			
				
	        Collections.sort(list);
	        
	        for(int i=0; i<list1.size();i++){
	        	if(list.get(i) != list1.get(i)){
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
