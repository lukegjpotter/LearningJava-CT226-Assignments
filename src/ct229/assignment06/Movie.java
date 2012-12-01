package ct229.assignment06;
//07013418 Luke Potter 12/November/2008

public class Movie extends Product
{
	//declare extra variables
	private static float movierentalprice;
	private int noofrentals;
	
	//constructor
	public Movie(String proid, String name)
	{
		super(proid, name);
		noofrentals = 0;
	}
	
	//Setting the rental price
	public void setRentalPrice(float price)
	{
		movierentalprice = price;
	}
	
	//Increments the "no of rentals" counter
	public void newSale()
	{
		noofrentals++;
	}
	
	//calculates earnings
	float getEarnings()
	{
		return (noofrentals * movierentalprice);
	}


}
