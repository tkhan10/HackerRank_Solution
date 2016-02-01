package com.tofek.thread;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class JsonEncodeDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
			
		JSONObject obj = new JSONObject();
		
		obj.put("name", "Tofek");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(2000.00));
		obj.put("is_vip", true);
		
		StringWriter out = new StringWriter();
		obj.writeJSONString(out);
		
		String jsonText = out.toString();
		System.out.println(jsonText);
	}

}
