package Lab7.prob2;

public class Ellipse implements ClosedCurve 
{
	private double semiMajorAxis;
	private double ellipIntegralAtEccentricity;
	public Ellipse(double semiMajorAxis, double e)
	{
		this.semiMajorAxis = semiMajorAxis;
		this.ellipIntegralAtEccentricity = e;
	}
	
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4 * semiMajorAxis * ellipIntegralAtEccentricity;
	}

}
