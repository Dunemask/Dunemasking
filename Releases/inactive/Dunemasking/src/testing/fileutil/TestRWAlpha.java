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
public class TestRWAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.home")+"/Desktop/tmp.txt");
		IOUtil.write(file, IOUtil.readAll(TestRWAlpha.class.getResource("/testing/resources/TestTextFile.txt")),0);

	}

}
