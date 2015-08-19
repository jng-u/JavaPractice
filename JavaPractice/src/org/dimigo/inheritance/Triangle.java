/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * ㄴ Triangle
 * 
 * Subject : 
 * 2015. 8. 17.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class Triangle extends Figure {
	private int width, height;
	
	public Triangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width*height/2;
	}
	
	protected void printCenter(){
		System.out.print("삼각형");
		super.printCenter();
	}
}
