package ct229.assignment03;
//07013418 Luke Potter 08-10-08
//This program gives out an insurance quote

//enable the use of dialog and message boxes 
import javax.swing.JOptionPane;

public class InsuranceCalculator
{
	public static void main(String[] args)
	{
		//declare variables
		int age, accidentfreeyrs, i=0;
		double noclaimsbonus = 0.1, premium=0;
		String name, gender, conversion;
		
		//get the user's name
		System.out.println("***DETAILS***");
		name = JOptionPane.showInputDialog("Please enter your name.");
		System.out.println("Name: " +name);
		
		//get the user's age
		conversion = JOptionPane.showInputDialog(name+ " please enter your age.");
		age = Integer.parseInt(conversion);
		System.out.println("Age: " +age);
		if(age<20 || age>75)
		{
			JOptionPane.showMessageDialog(null,"Sorry " +name+ " we do not insure drivers under 20 or over 75 years old");
			System.exit(0);
		}
		
		//get the user's gender
		gender = JOptionPane.showInputDialog(name+ " please enter your gender.");
		System.out.println("Gender: " +gender);
		
		if(gender.equals("Male") || gender.equals("male"))
		{
			//setting premium for males
			if(age<=22)
				premium = 2100;
			else if(age>=26)
				premium = 1000;
			else
				premium = 1700;
		}
		else if(gender.equals("Female") || gender.equals("female"))
		{
			//setting premium for females
			if(age<24)
				premium = 1600;
			else
				premium = 900;
		}
		else
		{
			JOptionPane.showMessageDialog(null,name+ " you have not entered a correct gender");
			System.exit(0);
		}
		
		//get the user's number of accident free driving
		conversion = JOptionPane.showInputDialog(name+ " please enter the number of years you have been claims free.");
		accidentfreeyrs = Integer.parseInt(conversion);
		System.out.println("# Of Years Claims Free Driving: " +accidentfreeyrs);
		if(age-accidentfreeyrs < 17)
		{
			JOptionPane.showMessageDialog(null,name+ " the information regarding the length of your number of claims free driving years is incorrect");
			System.exit(0);
		}
		
		//limiting accidentfreeyrs to 5
		if(accidentfreeyrs>=5)
			accidentfreeyrs = 5;
		
		//calculating the premium
		while(i<accidentfreeyrs)
		{
			premium = premium-(premium*noclaimsbonus);
			i++;
		}
		
		//display the premium to the user
		JOptionPane.showMessageDialog(null, name+ " your premium is " +premium);
		System.out.printf("Premium: %.2f", premium);
	}
}