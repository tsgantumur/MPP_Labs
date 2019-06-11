package Lab8.day1.prob2.ab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) 
	{
		List<Product> products = new ArrayList<Product>();

		products.add(new Product("B", 2000.0, 1));
		products.add(new Product("A", 1000.0, 2));
		products.add(new Product("C", 500.0, 3));
		products.add(new Product("D", 3000.0, 4));

		// TODO Auto-generated method stub
		Collections.sort(products, new ProductPriceComparator());
		System.out.println(products);
		
		Collections.sort(products, new ProductTitleComparator());
		System.out.println(products);
		
	}

}
