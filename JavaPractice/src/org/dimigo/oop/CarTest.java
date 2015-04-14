/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * ㄴ CarTest
 * 
 * Subject : 
 * 2015. 4. 14.
 * </pre>
 *
 * @author HP
 * @version 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		car.setCompany("현대자동차");
		car.setModel("제네시스");
		car.setColor("검정색");
		car.setMaxSpeed(225);
		car.setPrice(50000000);
		Output(car);

		car.setCompany("기아자동차");
		car.setModel("K7");
		car.setColor("흰색");
		car.setMaxSpeed(246);
		car.setPrice(40000000);
		Output(car);

		car.setCompany("삼성자동차");
		car.setModel("SM7");
		car.setColor("회색");
		car.setMaxSpeed(200);
		car.setPrice(38000000);
		Output(car);
	}

	public static void Output(Car car){
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
	}
	
}
