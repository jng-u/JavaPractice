/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * ㄴ FamilyMember
 * 
 * Subject : 
 * 2015. 6. 16.
 * </pre>
 *
 * @author HP
 * @version 1.0
 */
public class FamilyMember {
	public static int memberCnt;
	public String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println();
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
		System.out.println();
	}
}
