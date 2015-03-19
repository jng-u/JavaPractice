package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9, b=10;
		double s_h = 5.8;
		double p_h = 5.4;
		
		double s_S = (a+b)*s_h/2;
		double p_S = a*p_h;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + s_S);
		System.out.println("평행사변형 넓이 : " + p_S);
		
		double minus = s_S-p_S;
		if(s_S<p_S){
			minus -= 1;
			System.out.println("평행사변형이 사다리꼴보다 " + minus + "더 큽니다");
		}
		else {
			System.out.println("사다리꼴이 평행사변형보다 " + minus + "더 큽니다");
		}
	}

}
