/**
 * 
 */
package com.tofek;

/**
 * @author tofek.khan
 *
 */
public class DiagonalDifference_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
         a[0][0]= 11;
         a[0][1]= 2;
         a[0][2]= 4;
         a[1][0]= 4;
         a[1][1]= 5;
         a[1][2]= 6;
         a[2][0]= 10;
         a[2][1]= 8;
         a[2][2]= -12;         
        
         int n = 3;
		int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(i == j){
                  sum1 = sum1+a[i][j];
                }                
            }
        }
        
        for(int i=0; i < n; i++){
            for(int j=n-1; j>=0; j--){
            	if(i+j==(n-1)){
                	sum2 = sum2+a[i][j];
                }                
            }
        }
        
        int res = Math.abs(sum1-sum2);
        System.out.println(res);

	}

}
