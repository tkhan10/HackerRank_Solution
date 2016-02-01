/**
 * 
 */
package com.tofek.thread;

/**
 * @author tofek.khan
 *
 */
public class JavaAtomic {
	
	public static int count = 0;
	
	public JavaAtomic (){
		count++;
	}
	
	public static void main(String[] args) {
		new JavaAtomic();
		new JavaAtomic();
		new JavaAtomic();
		
		System.out.println("Count is "+count);
	}

}
