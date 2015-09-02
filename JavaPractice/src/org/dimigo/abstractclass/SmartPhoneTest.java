/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * ㄴ SmartPhoneTest
 * 
 * Subject : 
 * 2015. 8. 28.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s1 = new IPhone("iPhone 6", "Apple", 700000);
		SmartPhone s2 = new Galaxy("Galaxy S6", "Samsung", 650000);
		
		System.out.println(s1.toString());
		s1.turnOn();
		s1.pay();
		s1.useSpecialFunction();
		s1.turnOff();
		System.out.println();
		
		System.out.println(s2.toString());
		s2.turnOn();
		s2.pay();
		s2.useSpecialFunction();
		s2.turnOff();
		System.out.println();
	}

}
