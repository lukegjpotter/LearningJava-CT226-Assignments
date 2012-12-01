package ct229.assignment05;
//07013418 Luke Potter 29-10-08
//This program tests the object "Rectangle" by giving it parameters

public class RectangleTester
{
	public static void main(String[] args)
	{
		//declare variables
		float l = 15, w = 10;
		
		//create new object
		RectangleConstructor rect = new RectangleConstructor();
		
		//print out the results
		System.out.println("*** RESULTS ***");
		
		//get a length and output it
		rect.setLength(l);
		System.out.println("The length of the rectangle is " +rect.retLength()+ " meters.");
		
		//get a width and output it
		rect.setWidth(w);
		System.out.println("The width of the rectangle is " +rect.retWidth()+ " meters.");
		
		//output the perimeter
		System.out.println("The perimeter of the rectangle is " +rect.calPerimeter()+ " meters.");
		
		//output the area
		System.out.println("The area of the rectangle is " +rect.calArea()+ " meters squared.");
	}
}