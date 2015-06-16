/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * ㄴ PiggyBank
 * 
 * Subject : 
 * 2015. 6. 16.
 * </pre>
 *
 * @author HP
 * @version 1.0
 */
public class PiggyBank {
	public static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		balance += amount;
	}
	
	public static void printBalance() {
		System.out.println();
		System.out.println("돼지 저금통 총 금액 : " + balance + "원");
		System.out.println();
	}
}
