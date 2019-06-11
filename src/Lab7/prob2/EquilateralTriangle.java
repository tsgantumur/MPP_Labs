package Lab7.prob2;

public class EquilateralTriangle implements Polygon {
	private double side;
	public EquilateralTriangle(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}
	
	@Override
	public double[] getLengths() {
		// TODO Auto-generated method stub
		double[] leng = new double[] {side, side, side};
		return leng;
	}
	

}
