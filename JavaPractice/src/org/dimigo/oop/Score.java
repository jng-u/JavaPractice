/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * ㄴ Score
 * 
 * Subject : 
 * 2015. 5. 13.
 * </pre>
 *
 * @author HP
 * @version 1.0
 */
import java.util.Scanner;

public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		String score = new StringBuilder("<<점수 출력>>\n")
		.append("국어점수 : " + kor + "\n")
		.append("수학점수 : " + math + "\n")
		.append("국어점수 : " + eng + "\n")
		.append("총점 : " + String.format("%d", kor+math+eng) + "\n")
		.append("평균 : " + String.format("%.1f", (kor+math+eng)/3.0)).toString();
		
		System.out.println(score);
		scanner.close();
	}

}
