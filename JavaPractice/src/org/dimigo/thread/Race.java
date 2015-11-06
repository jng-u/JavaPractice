/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * ㄴ Race
 * 
 * Subject : 
 * 2015. 11. 6.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class Race{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Runner("홍길동");
		Thread t2 = new Runner("홍길순");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
	