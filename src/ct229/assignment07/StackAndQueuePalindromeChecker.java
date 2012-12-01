package ct229.assignment07;
//07013418 Luke Potter 21/January/2009
import javax.swing.JOptionPane;

public class StackAndQueuePalindromeChecker
{
	public static void main(String[] args)
	{
		//declare variables
		int i = 0;
		boolean pal = true;
		String str = "", upperstr = "";
		
		//create queue
		Queue que = new Queue();
		//create stack
		Stack sck = new Stack();
		
		//get the string
		str = JOptionPane.showInputDialog("Please enter a string");
		
		//convert all enteries to uppercase
		upperstr = str.toUpperCase();
		
		//populate stack and queue
		while(i < upperstr.length())
		{
			sck.push(upperstr.charAt(i));
			que.enqueue(upperstr.charAt(i));
			i++;
		}
		
		//compare popped and dequeued characters
		i = 0;
		while((i < upperstr.length()) && (pal == true))
		{
			if(sck.pop() == que.dequeue())
				pal = true;
			else
				pal = false;
			i++;
		}
		
		//return verdict on string
		if (pal == true)
		{
			JOptionPane.showMessageDialog(null,"The string "+ str +" is a palindrome");
			System.out.println("The string "+ str +" is a palindrome");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"The string "+ str +" is NOT a palindrome");
			System.out.println("The string "+ str +" is NOT a palindrome");
		}
	}
}
