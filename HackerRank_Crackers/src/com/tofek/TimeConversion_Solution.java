/**
 * 
 */
package com.tofek;

/**
 * @author tofek.khan
 *
 */
public class TimeConversion_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String time = "12:45:54PM";


		String am = "AM";
		String pm = "PM";
		String hour = time.split(":")[0];
		String min = time.split(":")[1];
		String sec = time.split(":")[2];
		String e = null;
		int hourInt = 0;

		if(sec.contains(pm)){			
			e =sec.split(pm)[0];			
			hourInt = 12+ Integer.parseInt(hour);
			if(hourInt == 24)				
				hour = "12";				
			else
				hour = String.valueOf(hourInt);
		}else{
			e =sec.split(am)[0];
			if(Integer.parseInt(hour) == 12){
				hour = String.format("%02d", 0);
			}
			
		}

		System.out.println(hour+":"+min+":"+e);


	}

}
