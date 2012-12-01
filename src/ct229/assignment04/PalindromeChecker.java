package ct229.assignment04;
//07013418 Luke Potter 22-10-08
//This program checks if a string is a palindrome

import javax.swing.JOptionPane;

public class PalindromeChecker
{
	public static void main(String[] args)
	{
		//declare variables
		String string1;
		boolean pal = true;
		
		//get input
		string1 = JOptionPane.showInputDialog("Please enter a string (This is case sensitive).");
		
		while(string1.length() == 0)
			string1 = JOptionPane.showInputDialog("The last string you entered was of legth zero. Please enter a string (This is case sensitive).");
		{
			/*declare variables that only exist in this block
			 * I'm doing this because it keeps saying that
			 * 'string1 may not have been initialised'
			 * when I declare them up the top
			 */
			int left = 0, right = (string1.length()-1);
			
			//only check to the middle of the string
			while((left < right) && pal == true)
			{
				//check to see if the current letters are the same
				if (string1.charAt(left) == string1.charAt(right))
					pal = true;
				else
					pal = false;
				
				//increment the counters
				left++;
				right--;
			}
		}

		//results
		System.out.println("***Palindrome Detector***");
		System.out.println("String is '" +string1+ "'.");
		
		//main results
		if(pal == true)
		{
			JOptionPane.showMessageDialog(null, "The string, '" +string1+ "' is a palindrome.");
			System.out.println("The string is a palindrome.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The string, '" +string1+ "' is not a palindrome.");
			System.out.println("The string is not a palindrome.");
		}
	}
}