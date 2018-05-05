package com.hs.singlylinkedlist;

/**
 * This class is the implementation of the LinkedList element
 * 
 * @since v0.0.1
 * @author Hasan Sunasara
 *
 */
public class HSElement {
	
	private int iValue;
	private HSElement nextElement;
	
	HSElement(int iValue) {
		this.iValue = iValue;
	}
	
	/**
	 * 
	 * @return int element value
	 */
	int getValue() {
		return iValue;
	}
	
	/**
	 * Sets int element value
	 * @param iValue int element value
	 */
	void setValue(int iValue) {
		this.iValue = iValue;
	}
	
	/**
	 * @return Next element in the list
	 */
	HSElement getNextElement() {
		return nextElement;
	}
	
	/**
	 * Sets next element in the list
	 * @param nextElement
	 */
	void setNextElement(HSElement nextElement) {
		this.nextElement = nextElement;
	}
	
	

}
