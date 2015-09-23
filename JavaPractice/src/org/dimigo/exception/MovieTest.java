/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * ㄴ MovieTest
 * 
 * Subject : 
 * 2015. 9. 23.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try{
			Movie[] movies = {
					new Movie("베테랑", 15), new Movie("사도", 12), new Movie("앤트맨", 12)
			};
			int age = 13;
			for(Movie movie : movies){
				try {
					buyTicket(movie, age);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
//		} catch(Exception e){
//			System.out.println(e.getMessage());
//		}

	}
	
	private static void buyTicket(Movie movie, int age) throws Exception{
		if(movie.getLimitAge()>age){
			throw new AgeChangeException(movie);
		} else{
			System.out.println(movie.getTitle() + " 즐감 하세요");
		}
	}

}
