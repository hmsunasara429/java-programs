package com.hs.singlylinkedlist;

/**
 * This class is the implementation of the singly LinkeList with limited functions.
 * @since v0.0.1
 * @author Hasan Sunasara
 *
 */
public class HSLinkedList 
{
    private HSElement head;
    private HSElement tail;
    
    /**
     * Appends int element to the list
     * @param iValue
     */
    public void append(int iValue)
    {
    	//Create new element
    	HSElement element = new HSElement(iValue);
    	
    	if(null == head)
    	{
    		//When the list is empty
    		head = element;
    		tail = element;
    	}
    	else
    	{
    		//When the list is non-empty
    		tail.setNextElement(element);
    		tail = element;
    	}
    }
    
    /**
     * Removes the last element
     */
    public void removeLast()
    {
    	//Process only if the list is non-empty
    	if(null != head)
    	{
    		if(head == tail)
    		{
    			//When there is only one element in the list
    			head = null;
    			tail = null;
    		}
    		else {
    			
    			//When there are more than one elements in the list
    			HSElement currentElement = head;
    			HSElement nextElement = head.getNextElement();
        		
    			//Iterate up to the second last element
    			while(null != nextElement)
        		{
        			if(nextElement == tail)
        			{
        				//Remove the last element
        				currentElement.setNextElement(null);
        				tail = currentElement;
        				nextElement = null;
        			}
        			else
        			{
        				//move to the next element
        				currentElement = nextElement;
        				nextElement = currentElement.getNextElement();
        			}
        		}
    		}
    		
    	}
    }
    
    /**
     * Removes all elements that are greater than the specific value
     */
    public void removeAllGreaterThan(int iValue)
    {
    	//Process only if the list is non-empty
    	if(null != head)
    	{
    		HSElement currentElement = head;
			HSElement nextElement = head.getNextElement();
			HSElement previousElement=null;
			
			int iCurrentValue = 0;
			
			//Iterate up to the last element
			while(null != currentElement)
			{
				iCurrentValue = currentElement.getValue();
				
    			if((currentElement == tail) && (currentElement == head))
    			{
    				//When there is only one element in the list
    				
    				if(iCurrentValue > iValue)
    	    		{
    					//Remove the element and make the list empty
    					head = null;
    					tail = null;
    	    		}
    				
    				currentElement = null;
    			}
    			else if(currentElement == head)
    			{
    				//When the element is the very first node in the list
    				
    				if(iCurrentValue > iValue)
    	    		{
    					//Remove the element and move the head to the next element
    					head = nextElement;
    	    		}
    				else
    				{
    					//Keep the previous element reference only if current element is not removed
    					previousElement = currentElement;	
    				}
    				
    				//Move the current element reference to the next one
    				currentElement = nextElement;
    				nextElement = currentElement.getNextElement();
    				
    			}
    			else if(currentElement == tail)
    			{
    				
    				//When the element is the very last node in the list
    				
    				if(iCurrentValue > iValue)
    	    		{
    					//Remove the element and move the tail backward
    					tail = previousElement;
    					previousElement.setNextElement(null);
    	    		}
    				
    				currentElement = null;
    			}
    			else
    			{
    				//When the element has previous and next nodes in the list
    				
    				if(iCurrentValue > iValue)
    	    		{
    					//Remove the element by linking previous element with the next one
    					previousElement.setNextElement(nextElement);
    	    		}
    				else
    				{
    					//Keep the previous element reference only if current element is not removed
    					previousElement = currentElement;
    				}
    				
    				//Move the current element reference to the next one
    				currentElement = nextElement;
    				nextElement = currentElement.getNextElement();
    			}
			}
    	}
    }
    
    /**
     * Prints all elements of the list
     */
    public void printAll()
    {
    	//Process only if the list is non-empty
    	if(null != head)
    	{
    		HSElement currentElement = head;
			HSElement nextElement = head.getNextElement();
			int iCurrentValue = 0;
			
			//Iterate up to the last element
			while(null != currentElement)
			{
				iCurrentValue = currentElement.getValue();
				
    			if(currentElement == tail)
    			{
    				//Stop at the last element
    				currentElement = null;
    			}
    			else 
    			{
    				//Move the current element reference to the next one
    				currentElement = nextElement;
    				nextElement = currentElement.getNextElement();
    			}
    			System.out.println(iCurrentValue);
			}
    	}
    	else 
    	{
    		System.out.println("No elements");
		}
    }
	
}
