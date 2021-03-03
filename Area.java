
public class Area {
	
	/*
	 * Area of Triangle
	 * @param width :Width of a Triangle
	 * @param height:Height of a Triangle
	 * @return Area of Triangle
	 */
	
	public double triangle(double width,double height){
		return (width*height)/2;
	}
	
	/*
	 * Area of Rectangle
	 * @param width :Width of Rectangle
	 * @param height:Height of Rectangle
	 * @return Area of Rectangle
	 */
	public double Rectangle(double width,double height)
	{
		return width*height;
	}
	
	/*
	 * Area of Square
	 * @param width: Width of Square
	 * @return Area of Square
	 */
	
	public double Square(double width)
	{
		return width*width;
	}
	
	/*
	 * Area of Circle
	 * @param radius:Radius of Circle
	 * @return Area of Circle
	 */
	public double Circle(double radius)
	{
		return 3.14*radius*radius;
	}
	
	public static void main(String...arg)
	{
		Area ar=new Area();
		System.out.println(ar.triangle(10, 10));
		System.out.println(ar.Circle(5.5));
		System.out.println(ar.Rectangle(7.8, 8.9));
		System.out.println(ar.Square(10));
	}

}
