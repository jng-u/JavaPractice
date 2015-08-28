/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * ㄴ SmartPhone
 * 
 * Subject : 
 * 2015. 8. 28.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다");
	}
	
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다");
	}
	
	public void pay(){
		
	}
	
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			IPhone i = (IPhone)phone;
			i.useAirDrop();
		}
		else if(phone instanceof Galaxy){
			Galaxy g = (Galaxy)phone;
			g.useWirelessCharging();
		}
	}
	
	public String toString(){
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price) + "원";
	}

}
