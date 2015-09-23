/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * ㄴ Movie
 * 
 * Subject : 
 * 2015. 9. 23.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
		
}
