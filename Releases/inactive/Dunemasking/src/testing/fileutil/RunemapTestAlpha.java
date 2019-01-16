/**
 * 
 */
package testing.fileutil;

import java.io.File;

import dunemask.xml.Runemap;

/**
 * @author Dunemask
 *
 */
public class RunemapTestAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File out = new File(System.getProperty("user.home")+"/Desktop/tmp.txt");
		Runemap rm = new Runemap(out);
		//rm.writeContainer("hello");
		rm.writeForcedContainer("hello/potato/");
		rm.writeElement("hello/potato/yes", "asdf");
		System.out.println(rm.getChildrenURLS("hello/potato/"));
		rm.write();
		String vl =rm.getvalue("hello/potato/yes");
		System.out.println(vl);
	}
}
