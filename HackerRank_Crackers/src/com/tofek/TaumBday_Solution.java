package com.tofek;

/**
 * 
 * @author tofek.khan
 *
 *
 *5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2
 */
public class TaumBday_Solution {

	public static void main(String[] args) {
		//81121308 2772464
		//720682 615826 14843
		long min = test(-1,-2,-1,-1,-1);
		System.out.println("Mon = "+ min );
		
		long a = 81121308*720682;
		System.out.println("-"+a);

	}

	public static long test(long b,long w, long x, long y, long z){
		long[] array = new long[5];


		array[0] = (b*x+w*y);
		array[1] = b*x+w*x+b*z;
		array[2] = b*x+w*x+w*z;
		array[3] = b*y+w*y+w*z;
		array[4] = b*y+w*y+b*z;

	

		long temp = array[0];
		for(int i= 1; i<array.length;i++){

			if(temp > array[i]){
				temp = array[i];
			}


		}
		return temp;
	}
}
