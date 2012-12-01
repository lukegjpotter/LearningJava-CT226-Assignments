package ct229.assignment08;
//07013418 Luke Potter 28 January 2009

import javax.swing.JOptionPane;

public class Assignment8Test
{
	public static void main(String[] args)
	{
		//declare variables
		int i = 1, j = 1;
		
		//create list
		LinkedListImplementingStack ll = new LinkedListImplementingStack();
		System.out.println("Linked list made");
		//create stack
		ArrayStack as = new ArrayStack();
		System.out.println("Stack made\n");
		
		//push values onto stack and into list
		while(i < 10)
		{
			ll.push(j);
			System.out.print(j+ " pushed onto list, ");
			as.push(j);
			System.out.println(j+ " pushed onto stack.");
			j = j * 2;
			i++;
		}
		System.out.println("\nFinished pushing, Starting popping and comparing\n");
		
		//pop and compare popped values form stack and list
		while(i > 0)
		{
			if(ll.pop() != as.pop())
			{
				JOptionPane.showMessageDialog(null, "Inconsistincy Found While Popping Element " +i);
				System.out.println("Inconsistency Found While Popping Element "+i);
			}
			i--;
		}
		System.out.println("Finished Popping and Comparing");
		System.exit(0);
	}
}