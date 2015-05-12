/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * ㄴ Question
 * 
 * Subject : 
 * 2015. 5. 12.
 * </pre>
 *
 * @author HP
 * @version 1.0
 */
import java.util.Scanner;

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String singer = new String("아이유");
		String actor = new String("송지효");
		String food = new String("회");
		String answer;
		
		System.out.println("가장 좋아하는 가수는?");
		answer = scanner.nextLine();
		if(answer.equals(singer)){
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if(answer.equals(actor)){
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		System.out.println("가장 좋아하는 음식는?");
		answer = scanner.nextLine();
		if(answer.equals(food)){
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
	}

}
