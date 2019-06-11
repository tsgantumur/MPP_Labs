package Lab8.day1.prob2.ab;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> 
{
	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.title.compareTo(p2.title);
	}

}
