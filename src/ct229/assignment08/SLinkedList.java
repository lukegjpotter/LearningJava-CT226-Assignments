package ct229.assignment08;
public class SLinkedList
{
	// head node of the list
	protected Node head;
	// node referncing current position in the list
	protected Node curr;
	// number of nodes in the list
	protected long size;
	
	/** Default constructor that creates an empty list. */
	public SLinkedList()
	{
		head = null;
		curr = null;
		size = 0;
	}

	public long size()
	{ 
		return size;
	}
	  
	public boolean isEmpty()
	{ 
		return (head == null);
	}

	public Object getCurr()
	{
		// Verify that there is a current node
		if (curr == null)
			return null;
		return curr.getElement();	
	}
	  
	public boolean gotoHead()
	{
		curr = head;
		if (curr == null)
			return false;
		return true;
	}

	public boolean gotoNext()
	{
		if (curr == null)
			// should only arise when list is empty
			return false;
		if (curr.getNext() == null)
			// no next node: at end
			return false;
		// there must be a next node, so go to it
		curr = curr.getNext();	  
		return true;	  
	}
	  
	public void insertNext(Object el)
	{
		if (head == null)
		{
			// If haven't inserted a head, do so now (for convenience)
			insertHead(el);
			return;
		}
		
		if (curr == null) 
			// should really throw an exception here: this should never happen
			return;
		
		// create new node with its next node equal to curr's next node
		Node newnode = new Node(el, curr.getNext());
		curr.setNext(newnode);
		size++;
	}
	  
	public void deleteNext()
	{
		if (curr == null || curr.getNext() == null)
			// no next: list empty or already at end
			return;
		// set curr's next equal to the next node's next
		curr.setNext(curr.getNext().getNext());
		// Note: Garbage collector will automatically clear up the node no longer referenced
		size--;
	}

	public void insertHead(Object el)
	{
		Node oldhead = head;
		head = new Node(el, oldhead);
		size++;	  
		curr = head;
	}
	  
	public void deleteHead()
	{
		if (head == null)
			// list already empty
			return;
		head = head.getNext();
		size--;
		curr = head;
	}
}
