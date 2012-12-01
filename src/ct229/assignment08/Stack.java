package ct229.assignment08;
/* M Madden, Nov 2005: Abstract Stack interface */
public interface Stack
{
	// most important methods
	// push an object onto top of the stack
	public void push(Object n);
	// pop an object from top of the stack
	public Object pop();

	// others
	// examine top object on stack without removing it
	public Object top();
	// true if stack is empty
	public boolean isEmpty();
	// true if stack is full (if it has limited storage)
	public boolean isFull();
}
