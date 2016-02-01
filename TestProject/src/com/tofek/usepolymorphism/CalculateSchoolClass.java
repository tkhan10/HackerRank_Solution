package com.tofek.usepolymorphism;

import java.util.HashMap;
import java.util.Map;

public class CalculateSchoolClass {
	
	public static void main(String[] args) {
		HashMap<String, Integer> schoolTOstd = new HashMap<String, Integer>();
		HashMap<Integer, Integer> stdTOrollnumber = new HashMap<Integer, Integer>();
		HashMap<Integer, String> rollnumberTOsubj = new HashMap<Integer, String>();
		HashMap<String, Integer> subjTOmarks = new HashMap<String, Integer>(); 
		
		schoolTOstd.put("ABC",1);
		schoolTOstd.put("ABC",2);
		schoolTOstd.put("ABC",3);
		schoolTOstd.put("ABC",4);
		
		stdTOrollnumber.put(1,1);
		stdTOrollnumber.put(1,2);
		stdTOrollnumber.put(1,3);
		stdTOrollnumber.put(1,4);
		stdTOrollnumber.put(1,5);
		
		rollnumberTOsubj.put(1,"M");
		rollnumberTOsubj.put(1,"C");
		rollnumberTOsubj.put(1,"P");
		rollnumberTOsubj.put(1,"PS");
		
//		subjTOmarks("M",30);
//		subjTOmarks("C",30);
//		subjTOmarks("P",30);
//		subjTOmarks("PS",30);
//		
//		int ro = stdTOrollnumber.get(1);
//		
//		HashMap<String,HashMap> a = new HashMap<String, HashMap>();
		
			
		
	}

}
