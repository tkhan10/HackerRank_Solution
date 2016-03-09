/**
 * 
 */
package com.tofek.thread.prodocerconsumerproblem;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author tofek.khan
 *
 */
public class ProducerConsumerProblem {
	/**
	 * It is that queue on which the value need to be store and retrieve.
	 */
	private static Vector<Object> data = new Vector<Object>(); 

	public static void main(String[] args) {
       new Producer().start();  
       new Consumer().start();
	}

	
	public static class Producer extends Thread{

		Producer(){
			super();
		}
		@Override
		public void run() {
			for(;;){
				try{
					Thread.sleep(1);

				}catch(Exception e){
					e.printStackTrace();
				}
				data.add(new Object());
				if(data.size()>1000){
					data.remove(data.size()-1);
				}

			}

		}

	}
	
	private static class Consumer extends Thread{
       
		Consumer() {
			super();
		}
		@Override
		public void run() {
			
			try{
				Thread.sleep(1);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			Iterator<Object> itr = data.iterator();
			while (itr.hasNext()) {
				itr.next();
			}
		}
		
	}

}
