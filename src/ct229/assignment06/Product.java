package ct229.assignment06;
//07013418 Luke Potter 12/November/2008

abstract class Product
{
	//declare variables
	String productid, title;
	
	//constructor
	public Product(String proid, String name)
	{
		productid = proid;
		title = name;
	}
	
	//return the ID
	public String retID()
	{
		return (productid);
	}
	
	//return the Title
	public String retTitle()
	{
		return (title);
	}
	
	//calculates earnings
	abstract float getEarnings();
	
	//displays the ID, Title and Earnings
	public void display()
	{
		System.out.println("*** Item Details ***");
		System.out.println("ID: " +productid);
		System.out.println("Title: " +title);
		System.out.println("Earnings: " +getEarnings());
		System.out.println("");
	}
}
