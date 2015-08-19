/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * ㄴ Circle
 * 
 * Subject : 
 * 2015. 8. 17.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class Circle extends Figure {
	private int radius;
	
	public Circle(int radius){
		this(0, 0, radius);
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}

	protected double calcArea() {
		return Math.PI*radius*radius;
	}

	protected void printCenter(){
		System.out.print("원 ");
		super.printCenter();
	}
}
