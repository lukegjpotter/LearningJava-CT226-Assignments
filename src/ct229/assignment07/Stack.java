package ct229.assignment07;
//07013418 Luke Potter 21/January/2009
import javax.swing.JOptionPane;

public class Stack
{
	// The actual capacity of the stack array
	protected int capacity;
	// default array capacity
	protected static final int CAPACITY = 1000;
	// array used to implement the stack 
	protected Object S[];
	// index for the top of the stack
	protected int top = -1;
	   
	public Stack()
	{
		// default constructor: creates stack with default capacity
		capacity = CAPACITY;
		S = new Object[capacity];
	}

	public Stack(int cap)
	{
		// this constructor allows you to specify capacity of stack
		capacity = cap;
		S = new Object[capacity]; 
	}
	
	public void push(Object element)
	{
		if (isFull())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Stack is full.");
			return;
		}
		top++;
		S[top] = element;
	}

	public Object pop()
	{
		Object element;
		if (isEmpty())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Stack is empty.");
			return  null;
		}
		element = S[top];
		S[top] = null;
		top--;
		return element;
	}

	public Object top()
	{
		if (isEmpty())
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
