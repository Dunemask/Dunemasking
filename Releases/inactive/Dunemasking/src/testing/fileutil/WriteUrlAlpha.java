/**
 * 
 */
package testing.fileutil;

import java.io.File;

import dunemask.util.FileUtil;

/**
 * @author Dunemask
 *
 */
public class WriteUrlAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File out = FileUtil.writeURL(WriteUrlAlpha.class.getResource("/testing/resources/TestTextFile.txt"));
		String path = out.getAbsolutePath();
		System.out.println(path);
		
		
	}

}
