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
		
		/*Car2 car_1 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 car_2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 car_3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);*/
		Car3 car_1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 car_2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 car_3 = new Car3("삼성자동차", "SM7", "회색");
		
		/*car.setCompany("현대자동차");
		car.setModel("제네시스");
		car.setColor("검정색");
		car.setMaxSpeed(225);
		car.setPrice(50000000);*/
		Output(car_1);

		/*car.setCompany("기아자동차");
		car.setModel("K7");
		car.setColor("흰색");
		car.setMaxSpeed(246);
		car.setPrice(40000000);*/
		Output(car_2);

		/*car.setCompany("삼성자동차");
		car.setModel("SM7");
		car.setColor("회색");
		car.setMaxSpeed(200);
		car.setPrice(38000000);*/
		Output(car_3);
	}

	public static void Output(Car3 car){
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
	}
	
}
