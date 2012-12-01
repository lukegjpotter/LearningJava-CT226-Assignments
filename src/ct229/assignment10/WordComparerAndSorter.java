package ct229.assignment10;
//07013418 Luke Potter 22/February/2009

import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.ArrayList;

public class WordComparerAndSorter
{
	public static void main(String[] args)
	{
		//declare variables
		String input = "empty";
		ArrayList <String> list = new ArrayList <String>();
				
		//get input		
		while ((input.compareTo("")) != 0)
		{
			input = JOptionPane.showInputDialog("Please Enter A Word (To Exit Word Entering, Enter Nothing And Press Return)");
			
			System.out.println("Input = " +input);
			//JOptionPane.showMessageDialog(null, "Input = " +input);
			//check for duplicate inputs
			if ((isUnique(input, list) == true) && (input.compareTo("") != 0))
			{
				//store unique inputs
				list.add(input);
			}
			else
			{
				if (input.compareTo("") != 0)
				{
					JOptionPane.showMessageDialog(null, "This has already been entered, so it will not be stored.");
					System.out.println("This has already been entered, so it will nat be stored");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Exited Word Entering, Moving on to sorting stored words...");
					System.out.println("Exited Word Entering, Moving on to sorting stored words...");
				}
			}
		}
		System.out.println("The words you entered were: " +list);
		//sort list
		Collections.sort(list);
		
		//display results
		System.out.println("The words you entered were: " +list);
		//JOptionPane.showMessageDialog(null, "The words you entered were: " +list);
	}
	
	//method for checking for duplicates
	static boolean isUnique(String str, ArrayList <String> l)
	{
		boolean unique = true;
		
		for (int x = 0; x < l.size(); x++)
		{
			if ((str.compareTo(l.get(x)) == 0) || (unique == false))
			{
				unique = false;
			}
		}
		return unique;
	}
}