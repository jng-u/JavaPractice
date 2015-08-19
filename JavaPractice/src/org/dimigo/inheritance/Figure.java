/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * ㄴ Figure
 * 
 * Subject : 
 * 2015. 8. 17.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class Figure {
	private int centerX, centerY;

	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea(){
		return 0;
	}
	
	protected void printCenter(){
		System.out.println("중심 좌표 : (" + centerX + ", " + centerY + ")");
	}
	
	protected void moveFigure(int x, int y){
		this.centerX += x;
		this.centerY += y;
	}
	
}
