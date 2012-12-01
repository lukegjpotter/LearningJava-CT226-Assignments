package ct229.assignment07;
//07013418 Luke Potter 21/January/2009
import javax.swing.JOptionPane;

public class Queue
{
	// array used to implement the queue
	protected Object Q[];
	// index for the rear of the queue
	protected int rear = -1;
	// The actual capacity of the queue array
	protected int capacity;
	// default array capacity
	public static final int CAPACITY = 1000;
  
	public Queue()
	{
		// default constructor: creates queue with default capacity
		capacity = CAPACITY;
		Q = new Object[capacity];
	}

	public Queue(int cap)
	{
		// this constructor allows you to specify capacity
		capacity = cap;
		Q = new Object[capacity]; 
	}
  
	public void enqueue(Object element)
	{
		if (isFull())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Queue is full.");
			return;
		}
		Q[++rear] = element;
	}

	public Object dequeue()
	{
		Object element;
		if (isEmpty())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Queue is empty.");
			return  null;
		}
		element = Q[0];
		
		// shuffle all other elements to the front
		for (int i=0; i<rear; i++)
			Q[i] = Q[i+1];

		Q[rear] = null; 
		rear--;
	  
		return element;
	}

	public Object front()
	{
		if (isEmpty())
		{
			JOptionPane.showMessageDialog(null, "ERROR: Stack is empty.");
			return null;
		}
		return Q[0];
	}
	   
	public boolean isEmpty()
	{
		return (rear < 0);
	}

	public boolean isFull()
	{
		return (rear == capacity-1);
	}

	public int size()
	{ 
		return (rear + 1);
	}
}