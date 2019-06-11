package Lab7.prob2;

public interface Polygon extends ClosedCurve
{
	default double computePerimeter()
	{
		double sum = 0;
		
		for(double side : getLengths())
		{
			sum += side;
		}
		
		return sum;
		
	}
	
	public double[] getLengths();
}
