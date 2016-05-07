/**
 * 
 */
package com.tofek.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.client.Service;

/**
 * @author tofek.khan
 *
 */
public class TestClient {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws Exception {
		java.net.URL endpoint = new URL("http://localhost:9090/CalculatorService/services/CallService");
		
		org.apache.axis.client.Service  service = new org.apache.axis.client.Service();
		
		CallServiceSoapBindingStub stub = new CallServiceSoapBindingStub(endpoint, service);

		int add = stub.add(10,10);
		int sub = stub.sub(20, 5);
		
		System.out.println("Add Result := "+add+", Sub Result := "+sub);
	}

}
