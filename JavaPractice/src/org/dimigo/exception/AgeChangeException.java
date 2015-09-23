/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * ㄴ AgeChangeException
 * 
 * Subject : 
 * 2015. 9. 23.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class AgeChangeException extends Exception {

	public AgeChangeException() {
	}
	
	public AgeChangeException(Movie movie) {
		super(movie.getTitle() + "는(은) " + movie.getLimitAge() + "이상 관람가 입니다");
	}
	
}
