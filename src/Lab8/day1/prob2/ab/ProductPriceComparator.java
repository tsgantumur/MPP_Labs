package Lab8.day1.prob2.ab;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> 
{

	@Override
	public int compare(Product p1, Product p2) 
	{
		// TODO Auto-generated method stub
		return Double.compare(p1.price, p2.price);
	}

}
