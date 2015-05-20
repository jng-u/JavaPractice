/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * ㄴ SnackTest
 * 
 * Subject : 
 * 2015. 5. 19.
 * </pre>
 *
 * @author HP
 * @version 1.0
 */

public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[] snack = new Snack[]{
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칩", "크라운", 1200, 1),
				new Snack("허니버터칩", "크리운", 1500, 4),
		};
		int sum = 0;
		for(Snack value : snack){
			value.printSnack();
			sum += value.calcPrice();
		}
		
		System.out.println("총 구매 금액" + sum + "원");
	}

}
