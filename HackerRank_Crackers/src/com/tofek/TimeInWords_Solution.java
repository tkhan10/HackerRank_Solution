/**
 * 
 */
package com.tofek;

/**
 * @author tofek.khan
 *
 */
public class TimeInWords_Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int hour = 5;
		int minute = 15;
		String res = convertTimeToWords(hour, minute);

		System.out.println(res);

	}

	private static String convertTimeToWords(int hour, int minute) {

		String[] days = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelwe"};
		String[] timeArray = {"", "one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelwe", "thirteen", "fourteen", "", "sixteen",
				"sevanteen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven",
				"twenty eight","twenty nine",""};
		String a = null;
		String result = null;
		String time = null;
		String minString = null;

		if(minute == 00){
			a = "o' clock";
			hour--;
		}else if(minute == 15){
			a = "quarter past";
			hour--;

		} else if(minute == 30){
			a = "half past";
			hour--;

		} else if(minute == 45){			
			a = "quarter to";	
			minute = 60 - minute;

		}else if(minute >= 1 && minute <15){
			a = "minutes past";
			hour--;

		}else if(minute >16 && minute <30){
			a = "minutes past";
			hour--;
		}
		else if((minute > 30 && minute <45) || (minute > 45 && minute <=59)){
			a = "minutes to";	
			minute = 60 - minute;

		}

		time = days[hour];	
		if(minute == 00){
			result = time+" "+a;
		}else{
			minString = timeArray[minute];
			result = minString+" "+a+" "+time;
		}


		return result.trim();

	}

}
