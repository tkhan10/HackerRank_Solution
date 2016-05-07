package com.tofek;

public class StairCase_Solution {


	public static void main(String[] args) {

		int n = 6;
		for(int j=0;j<n;j++){
			for(int i=1;i<=n;i++){
				if(i+j<n){
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}
			System.out.println("");
		}

	}
}
