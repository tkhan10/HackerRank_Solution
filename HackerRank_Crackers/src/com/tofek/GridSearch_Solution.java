/**
 * 
 */
package com.tofek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tofek.khan
 *
 */
public class GridSearch_Solution {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		
		int[][] copyFrom = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{2,3},{5,0}};
        int[][] copyTo = new int[b.length][b.length];
        
        
        for(int i = 0; i<copyFrom.length;i++){
        	outerloop:
        	for(int j = 0; j<copyFrom.length;j++){        		
        		for(int k=0; k<b.length;k++){
        			for(int l =0; l<b.length;l++){
        				if(copyFrom[i][j] == b[k][l]){
        				   break outerloop;	
        				}
        			}
        		}
        	}
        }
        
        
      /*for(int k= 0; k<b.length;k++){
        for(int i = k; i<b.length;i++){
        	for(int j = i; j<b.length;j++){
        		System.arraycopy(copyFrom, 0, copyTo, 0, b.length);
        	}        
        }
        
      }
        
        for(int i =0; i<copyTo.length;i++){
			for(int j =0; j<copyTo.length;j++){
				System.out.println(copyTo[i][j]);
			}
		}*/
        //System.out.println(new String(copyTo));
		
		
		/*int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};    
		int[] results = [];

		for(int i = 0; i < myArray.length; i++){
		  results.length;
		}*/
		
		/*int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

		int[][] b = {{2,3},{5,0}};
		int[][] c = new int[b.length][b.length];
		boolean flag = true;
		
		List<Integer> list = new ArrayList<Integer>();
	

		for(int i = 0; i<a.length;i++){
			for(int j= 0; j<a.length;j++){
				list.add(a[i][j]);

			}
		}
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()){	
			int abc = itr.next();
			for(int i = 0; i<b.length;i++){
				for(int j= 0; j<b.length;j++){
					if( abc == b[i][j]){
						System.out.println(b[i][j]);
						c[i][j] = b[i][j];
						abc = itr.next();
					}
				}
				
			}
		}
		
		for(int i =0; i<b.length;i++){
			for(int j =0; j<b.length;j++){
				if(b[i][j] != c[i][j]){
				   flag = flag && false;
				}else{
					flag = flag && true;
				}
			}
		}
		
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}

	*/
	}

}


