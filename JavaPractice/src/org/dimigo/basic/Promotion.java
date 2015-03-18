package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay = 1700000;
		int staff = 3;
		int stores = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", pay) + "원");
		System.out.println("점포 내 직원 : " + String.format("%,d", staff) + "명");
		System.out.println("점포 수 : " + String.format("%,d", stores) + "개");
		System.out.println("");
		long year_pay = (long)pay*12*(long)staff*(long)stores;
		System.out.println("연간 인건비 : " + String.format("%,d", year_pay) + "원");
	}

}
