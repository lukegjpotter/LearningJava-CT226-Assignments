package ct229.assignment06;
//07013418 Luke Potter 12/November/2008

public class Music extends Product
{
	//declare extra variables
	private float songsaleprice;
	private int noofsales;
	
	//constructor
	public Music(String proid, String name)
	{
		super(proid, name);
		noofsales = 0;
	}
	
	//Setting the song price
	public void setSalePrice(float price)
	{
		songsaleprice = price;
	}
	
	//Increments the "no of sales" counter
	public void newSale()
	{
		noofsales++;
	}
	
	//calculates earnings
	float getEarnings()
	{
		return (noofsales * songsaleprice);
	}


}
