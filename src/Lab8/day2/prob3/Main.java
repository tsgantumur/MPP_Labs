package Lab8.day2.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		System.out.println("foreach with Lambdas:");
		System.out.println("***********************");
		fruits.forEach(fruit -> System.out.println(fruit));
		
		System.out.println("foreach with Method reference: ");
		System.out.println("***********************");
		fruits.forEach(System.out::println);
		
	}

}
