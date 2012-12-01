package ct229.assignment05;
//07013418 Luke Potter 29-10-08
//This program tests the object "Complex" by giving it parameters.

public class ComplexNumberTester
{
	public static void main(String[] args)
	{
		//declare variables
		float r1 = 100, i1 = 50, r2 = 30, i2 = -25;
		
		//creating new objects
		ComplexNumberConstructor c1 = new ComplexNumberConstructor();
		ComplexNumberConstructor c2 = new ComplexNumberConstructor();
		ComplexNumberConstructor addresult = new ComplexNumberConstructor();
		ComplexNumberConstructor subresult = new ComplexNumberConstructor();
		
		//setting values for the object c1
		System.out.println("*** Complex Number 1 ***");
		
		//real
		c1.setReal(r1);
		System.out.println("The real part of Complex Number 1 = " +c1.retReal());
		
		//imaginary
		c1.setImag(i1);
		System.out.println("The imaginary part of Complex Number 1 = " +c1.retImag());
		
		//print out in "(a, b)" form
		System.out.println("Complex Number 1 = " +c1.retInStringForm());
		System.out.println("");
		
		//setting values for the object c2
		System.out.println("*** Complex Number 2 ***");
		
		//real
		c2.setReal(r2);
		System.out.println("Real Part = " +c2.retReal());
		
		//imaginary
		c2.setImag(i2);
		System.out.println("Imaginary Part = " +c2.retImag());
		
		//print out in "(a, b)" form
		System.out.println("Complex Number 2 = " +c2.retInStringForm());
		System.out.println("");
		
		//adding and subtracting
		System.out.println("*** Addition and Subtraction ***");
		
		//adding c1 and c2
		addresult = addresult.addValues(c1, c2);
		System.out.println("Complex Number 1 and Complex Number 2 added = " +addresult.retInStringForm());
		
		//subtracting c1 and c2
		subresult = subresult.subValues(c1, c2);
		System.out.println("Complex Number 1 and Complex Number 2 subtracted = " +subresult.retInStringForm());
	}
}