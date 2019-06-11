package Lab7.prob2;

public class Rectangle implements Polygon
{
	private double length;
	private double width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double computePerimeter()
	{
		return 2 * length + 2 * width;
	}

	@Override
	public double[] getLengths() {
		// TODO Auto-generated method stub
		return null;
	}

}
