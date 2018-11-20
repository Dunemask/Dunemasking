/**
 * 
 */
package dunemask.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;

/**
 * @author Dunemask
 * Simple File Utilities 
 *
 */
public class IOUtil {
	
	/** Write A URL to a file in a specified location
	 * 
	 * @param url URL to be written
	 * @param file File to be written to
	 * 
	 * 
	 * 
	 * */
	public static void writeURL(File file, URL url) {

		try {
			
			FileOutputStream fos = new FileOutputStream(file);
			InputStream is = url.openStream();
			byte[] buffer = new byte[1024*1024];
			int len;
			while((len=is.read(buffer, 0, is.available()))!=0) {
				fos.write(buffer, 0, len);
			}
			fos.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/** Write A URL to a temporary file
	 * 
	 * @param url URL to be written
	 * @return The file which the url has been written to
	 * 
	 * 
	 * 
	 * */
	public static File writeURL(URL url) {
		File file = null;
		try {
			file = File.createTempFile("DMRAN"+new Random().nextInt(), ".dcu");
			IOUtil.writeURL(file, url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
		
	}
		
	
	
}
