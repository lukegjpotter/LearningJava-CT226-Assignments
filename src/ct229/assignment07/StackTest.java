package ct229.assignment07;
//07013418 Luke Potter 21/January/2009
import javax.swing.JOptionPane;

public class StackTest
{
	public static void main(String[] args)
	{
		// Create the Stack
		Stack s = new Stack(); 
		
		// Put some strings onto the stack
		JOptionPane.showMessageDialog(null, "About to push words onto stack: \nOnce upon a time");
		s.push("Once");
		s.push("upon");
		s.push("a");
		s.push("time");

		// Now pop them from the stack
		JOptionPane.showMessageDialog(null, "About to pop words from stack ...");
		
		while(! s.isEmpty())
		{
			String word = (String)s.pop(); // Note: have to cast Objects popped to String
			JOptionPane.showMessageDialog(null, "Word popped: " + word);
		}
		
		System.exit(0);
	}
}
