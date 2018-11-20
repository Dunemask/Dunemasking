/**
 * 
 */
package testing.fileutil;

import java.io.File;

import dunemask.util.IOUtil;

/**
 * @author Dunemask
 *
 */
public class WriteUrlAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File out = IOUtil.writeURL(WriteUrlAlpha.class.getResource("/testing/resources/TestTextFile.txt"));
		String path = out.getAbsolutePath();
		System.out.println(path);
		
		
	}

}
