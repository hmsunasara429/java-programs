/**
 * 
 */
package com.hs.java.test;

import com.hs.java.HSElement;
import com.hs.java.HSLinkedList;

/**
 * Main class to test the java programs
 * @since v0.0.1
 * @author Hasan Sunasara
 */

public class HSMain {

	/**
	 * @param args Program arguments
	 */
	public static void main(String[] args) {
		HSLinkedList list = new HSLinkedList();
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		
		
		list.removeLast();
		
		list.removeAllGreaterThan(4);
		
		
		list.printAll();
		
	}

}
