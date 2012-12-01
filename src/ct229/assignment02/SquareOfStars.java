package ct229.assignment02;
//07013418 Luke Potter 01/10/08 Assignment 2, Part 2
//This program draws hollowed out squares using * and spaces

//dialog box methods
import javax.swing.JOptionPane;

public class SquareOfStars
{
	public static void main(String[] args)
	{
		//declare the variables
		int rac , i, j;
		String inpconstr;
			
		//Get input for the number of rows and columns
		inpconstr = JOptionPane.showInputDialog("Please enter the number of rows and columns you want (between 1 and 20).");
		rac = Integer.parseInt(inpconstr);
			
		//Check if the input is between 1 and 20
		if(rac>0 && rac<=20)
		{
			//nested 'for' loops to create the star squares
			for(j=0; j<rac; j++)
			{
				//check if the current line is either the first or the last line
				if(j==0 || j==(rac-1))
				{
					for(i=0; i<rac; i++)
					{
						System.out.print("*");
					}
					System.out.println("");					}
				//this is for checking if the current character is at the start or the end of the current line
				else
				{
					System.out.print("*");
					
					for(i=1; i<(rac-1); i++)
					{
						System.out.print(" ");
					}
					System.out.println("*");
				}
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You must enter a number between 1 and 20");
		}
	}
}