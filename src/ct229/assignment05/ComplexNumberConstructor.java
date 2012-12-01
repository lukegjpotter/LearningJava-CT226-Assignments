package ct229.assignment05;
//07013418 Luke Potter 29-10-08
//This program constructs the object complex.

public class ComplexNumberConstructor {
	//declare variables
	float real, imag;
	
	//set variables
	public ComplexNumberConstructor()
	{
		real = 1;
		imag= 1;
	}
	
	//set real value(s)
	public void setReal(float r)
	{
			real = r;
	}
	
	//return real value(s)
	public float retReal()
	{
		return (real);
	}
	
	//set imaginary value(s)
	public void setImag(float i)
	{
		imag = i;
	}
	
	//return imaginary value(s)
	public float retImag()
	{
		return (imag);
	}
	
	//return values in string form
	public String retInStringForm ()
	{
		return ("(" +real+ ", " +imag+ "i).");
	}

	//add values
	public ComplexNumberConstructor addValues (ComplexNumberConstructor com1, ComplexNumberConstructor com2)
	{
		ComplexNumberConstructor add = new ComplexNumberConstructor();
		add.real = com1.real + com2.real;
		add.imag = com1.imag + com2.imag;
		return (add);
	}
	
	//subtract values
	public ComplexNumberConstructor subValues (ComplexNumberConstructor com1, ComplexNumberConstructor com2)
	{
		ComplexNumberConstructor sub = new ComplexNumberConstructor();
		sub.real = com1.real - com2.real;
		sub.imag = com1.imag - com2.imag;
		return (sub);
	}
}