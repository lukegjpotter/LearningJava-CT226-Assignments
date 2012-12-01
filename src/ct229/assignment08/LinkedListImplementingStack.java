package ct229.assignment08;
//07013418 Luke Potter 28 January 2009

import javax.swing.JOptionPane;

public class LinkedListImplementingStack implements Stack
{
	SLinkedList S;
	
	public LinkedListImplementingStack()
	{
		S = new SLinkedList();
	}
	
	public void push(Object element)
	{
		S.insertHead(element);
	}

	public Object pop()
	{
		Object element;
		if (isEmpty())
		{
			JOptionPane.showMessageDialog(null, "ERROR: List is empty.");
			System.out.println("ERROR: List is empty.");
			return null;
		}
		S.gotoHead();
		element = S.getCurr();
		S.deleteHead();
		return element;
	}

	public Object top()
	{
		if (isEmpty())
		{
			JOptionPane.showMessageDialog(null, "ERROR: List is empty.");
			System.out.println("ERROR: List is empty.");
			return null;
		}
		S.gotoHead();
		return S.getCurr();
	}
		   
	public boolean isEmpty()
	{
		return S.isEmpty();
	}

	public boolean isFull()
	{
		return false;
	}
}
