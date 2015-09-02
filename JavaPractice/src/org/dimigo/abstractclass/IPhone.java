/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * ㄴ IPhone
 * 
 * Subject : 
 * 2015. 8. 28.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class IPhone extends SmartPhone {
	public IPhone(){
		
	}
	
	public IPhone(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제 합니다");
	}
	
	public void useAirDrop(){
		System.out.println("Air Drop 기능을 이용합니다");
	}

}
