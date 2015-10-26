/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * ㄴ SaveImageFromUrl
 * 
 * Subject : 
 * 2015. 10. 26.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://img.livecenter.co.kr/data/editor/1510/387410d2f1c60dd2a90dee842b6edb05_1444503691_1823.jpg";
		
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/sojin.jpg");){
				
				int result;
				byte[] buf = new byte[100];
				is.read(buf);
				while((result=is.read(buf))!=-1){
					os.write(buf,  0,  result);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
