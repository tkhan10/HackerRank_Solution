package com.tofek;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence ss, tell Roy if it is a pangram or not.

Input Format

Input consists of a string ss.

Constraints 
Length of ss can be at most 103103 (1≤|s|≤103)(1≤|s|≤103) and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.

Output Format

Output a line containing pangram if ss is a pangram, otherwise output not pangram.

Sample Input

Input #1

We promptly judged antique ivory buckles for the next prize    
Input #2

We promptly judged antique ivory buckles for the prize    
Sample Output

Output #1

pangram
Output #2

not pangram
Explanation

In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
 * @author tofek.khan
 *
 */
public class Pangrams_Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String  str = scan.nextLine();
		str = str.replaceAll("\\s+","").toLowerCase();
		char[] strChar = str.toCharArray(); 
		boolean flag = true;
		Set<Character> set = new HashSet<Character>();
		for(char ch : strChar){
			System.out.println(ch);
			set.add(ch);
		} 
		System.out.println(set.size());
		if(set.size() == 26){
          flag = true;			
		}else{
			flag = false;
		}
		
				
		if(flag)
		System.out.println("Pangrams");
        else
        System.out.println("Non Pangrams");
	}
}
