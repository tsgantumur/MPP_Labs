package Lab8.day2.prob1;

import java.util.function.Function;

public class MyClass 
{
	private int x;
	private String y;
	
	public MyClass(int x, String y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public String getY()
	{
		return y;
	}
	
	public boolean MyMethod(MyClass c1)
	{
		//decide the interface check the equality
		//print
		Function<MyClass, Boolean> f = this::equals;
		return f.apply(c1);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof MyClass))
			return false;
		
		MyClass mc = (MyClass)obj;
		System.out.println(mc.x + " " + mc.y);
		System.out.println(x + " " + y);
		
		return mc.x == x && mc.y.equals(y);
	}
	
}
