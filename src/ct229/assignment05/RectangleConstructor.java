package ct229.assignment05;
//07013418 Luke Potter 29-10-08
//This program constructs the object "rectangle".

public class RectangleConstructor {
	//declare variables
	float length, width, perimeter, area;
	
	//set variables
	public RectangleConstructor()
	{
		length = 1;
		width = 1;
	}
	
	//set length
	public void setLength(float len)
	{
		if(len<0 || len>20)
			length = 1;
		else
			length = len;
	}
	
	//return length
	public float retLength()
	{
		return length;
	}
	
	//set width
	public void setWidth(float wid)
	{
		if(wid<0 || wid>20)
			width = 1;
		else
			width = wid;
	}
	
	//return width
	public float retWidth()
	{
		return width;
	}
	
	//calculate perimeter
	public float calPerimeter()
	{
		return((2 * length) + (2 * width));
	}
	
	//calculate area
	public float calArea()
	{
		return (length * width);
	}
}