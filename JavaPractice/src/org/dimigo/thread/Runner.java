/**
 * 
 */
package org.dimigo.thread;


/**
 * <pre>
 * org.dimigo.thread
 * ㄴ Runner
 * 
 * Subject : 
 * 2015. 11. 6.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class Runner extends Thread{
	private String name;
	
	public Runner(){
		
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " 출발");
		
		for(int i=0; i<=10; i++){
			System.out.println(name + " " + (100-(10*i)) + "미터");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 도착");
	}

}
