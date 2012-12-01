package ct229.assignment02;
//07013418 Luke Potter 01/10/08 Assignment 2, Part 1
//This program compares the numbers that the user enters and records the smallest one

// Dialog box methods
import javax.swing.JOptionPane;

public class NumberComparer
{
	public static void main(String[] args)
	{
		//declare the variables
		int i, j, smallest, temp;
		String inpconstr;

		//Get the number of numbers that are going to be entered
		inpconstr = JOptionPane.showInputDialog("Please enter the amount of numbers you wish to compare.");
		i = Integer.parseInt(inpconstr);

		//Get the first number
		inpconstr = JOptionPane.showInputDialog("Please enter a number.");
		smallest = Integer.parseInt(inpconstr);
			
		//A 'for' loop to compare the inputs in real time
		for(j=1;j<i;j++)
		{
			//Get the other inputs
			inpconstr = JOptionPane.showInputDialog("Please enter another number.");
			temp = Integer.parseInt(inpconstr);
				
			if(temp<smallest)
				smallest = temp;
		}
			
		//output the smallest input
		JOptionPane.showMessageDialog(null, "The smallest number is " +smallest);
	}
}
