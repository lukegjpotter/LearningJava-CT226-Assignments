package ct229.assignment08;
/* M Madden, Nov 2005: Array implementation of Stack ADT  */

import javax.swing.JOptionPane;

public class ArrayStack implements Stack
{
	// The actual capacity of the stack array
	protected int capacity;
	// default array capacity
	protected static final int CAPACITY = 1000;
	// array used to implement the stack
	protected Object S[];
	// index for the top of the stack
	protected int top = -1;
   
	public ArrayStack()
	{
		// default constructor: creates stack with default capacity
		capacity = CAPACITY;
		S = new Object[capacity];
	}

	public ArrayStack(int cap)
	{
		// this constructor allows you to specify capacity of stack
		capacity = cap;
		S = new Object[capacity];
	}
   
	public void push(Object element)
	{
		if(isFull())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Stack is full.");
			System.out.println("ERROR: Stack is full.");
			return;
		}
		top++;
		S[top] = element;
	}

	public Object pop()
	{
		Object element;
		if(isEmpty())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Stack is empty.");
			System.out.println("ERROR: Stack is empty.");
			return  null;
		}
		element = S[top];
		S[top] = null;
		top--;
		return element;
	}

	public Object top()
	{
		if(isEmpty())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Stack is empty.");
			return null;
		}
		return S[top];
	}
	   
	public boolean isEmpty()
	{
		return (top < 0);
	}

	public boolean isFull()
	{
		return (top == capacity-1);
	}

	public int size()
	{
		return (top + 1);
	}
}