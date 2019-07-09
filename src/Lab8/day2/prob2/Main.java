package Lab8.day2.prob2;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i
		Supplier<Double> s = Math::random;
		System.out.println("i: " + s.get());
		
		//ii
		Supplier<Double> s2 = ()-> Math.random();
		System.out.println("ii: " + s2.get());
		
		//iii
		I3 i3 = new I3();
		System.out.println("iii: " + i3.get());
	}
	
	static class I3 implements Supplier<Double>
	{
		@Override
		public Double get() {
			// TODO Auto-generated method stub
			double d = Math.random();
			return d;
		}
		
	}


}
