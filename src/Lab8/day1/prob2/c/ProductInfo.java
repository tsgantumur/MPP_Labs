package Lab8.day1.prob2.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Lab8.day1.prob2.ab.Product;

public class ProductInfo 
{
	static enum SortMethod {BYPRICE, BYTITLE};
	
	public static void sort(List<Product> prod, final SortMethod method)
	{
		class ProductComparator implements Comparator<Product>
		{

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				if(method == SortMethod.BYTITLE)
				{
					return p1.getTitle().compareTo(p2.getTitle());
				}
				else
				{
					return Double.compare(p1.getPrice(), p2.getPrice());
				}
			}
			
		}
		
		Collections.sort(prod, new ProductComparator());
	}

	public static void main(String[] args)
	{
		List<Product> products = new ArrayList<Product>();

		products.add(new Product("B", 2000.0, 1));
		products.add(new Product("A", 1000.0, 2));
		products.add(new Product("C", 500.0, 3));
		products.add(new Product("D", 3000.0, 4));
		
		sort(products, SortMethod.BYPRICE);
		System.out.println(products);
		
		sort(products, SortMethod.BYTITLE);
		System.out.println(products);
		
	}
}
