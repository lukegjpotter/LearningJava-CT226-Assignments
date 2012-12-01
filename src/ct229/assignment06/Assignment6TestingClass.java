package ct229.assignment06;
//07013418 Luke Potter 12/November/2008

public class Assignment6TestingClass
{
	public static void main(String [] args)
	{
		//create objects
		Movie scarface = new Movie("SF001", "Scarface");
		Movie matrixtrilology = new Movie("MAT04", "Matrix Trilology");
		Music sexonfire = new Music("KOL03", "Sex On Fire");
		Music allthesethings = new Music("BFMV1", "All These Things (I Hate Revolve Around Me)");
		
		//test Movie
		scarface.setRentalPrice(4.50F);
		scarface.newSale();
		scarface.newSale();
		scarface.newSale();
		scarface.display();
		
		matrixtrilology.setRentalPrice(7.50F);
		matrixtrilology.newSale();
		matrixtrilology.newSale();
		matrixtrilology.display();
		
		//test Music
		sexonfire.setSalePrice(0.99F);
		sexonfire.newSale();
		sexonfire.newSale();
		sexonfire.newSale();
		sexonfire.display();
		
		allthesethings.setSalePrice(0.99F);
		allthesethings.newSale();
		allthesethings.newSale();
		allthesethings.display();
	}
}
