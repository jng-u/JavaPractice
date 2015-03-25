package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car = "경차";
		int distance = 35;
		int price;
		int tmp;
		
		if(distance%10==0){
			tmp=0;
		}
		else {
			tmp=1;
		}
		
		switch(car){
		case "고속버스":
			price = 850;
			price += 300*(distance/10-1+tmp);
			break;
		case "경차":
			price = 300;
			price += 200*(distance/10-1+tmp);
			break;
		default:
			price = 600;
			price += 200*(distance/10-1+tmp);
		}

		System.out.println("<< 고속도로 통행료 계산>>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료" + price + "원");
		
	}

}
