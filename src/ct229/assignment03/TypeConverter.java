package ct229.assignment03;
//07013418 Luke Potter 08-10-08
//This program converts between data types

public class TypeConverter
{
	public static void main(String[] args)
	{
		//Q1. declare variables
		int i = 57;
		float f = (float) 2.22;
		double d = 8000;
		String s = "11850";
		
		//Q2. convert integer to floating point number
		System.out.println("i) Integer is " +i+ ", Floating Point Number is " +(float)i);
		
		//Q3. convert Floating Point Number to Integer
		System.out.println("ii) Floating Point Number is " +f+ ", Integer is  " +(int)f);
		
		//Q4. convert String to Floating Point Number
		f = Float.parseFloat(s);
		System.out.println("iii) String is " +s+ ", Floating Point Number is " +f);
		
		//Q5. convert Double to String
		s = Double.toString(d);
		System.out.println("iv) Double is  " +d+ ", String is " +s);
		
		//Q6. convert Floating Point Number to Double
		f = (float)d;
		System.out.println("v) Floating Point Number is " +f+ ", Double is  " +d);
	}

}
