/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * ㄴ IdolGroup
 * 
 * Subject : 
 * 2015. 5. 27.
 * </pre>
 *
 * @author HP
 * @version 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				{"GD", "태양", "승리", "대성", "탑"},
				{"CL", "산다라박", "박봄", "공민지"},
				{"소진", "유라", "민아", "혜리", "그외"}
		};
		
		for(int i=0; i<idolGroup.length; i++){
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			for(String ivalue : members[i]){
				System.out.println(ivalue);
			}
			System.out.println();
			}
		}

}
