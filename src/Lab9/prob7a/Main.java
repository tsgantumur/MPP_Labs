package Lab9.prob7a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		List<String> letters = IntStream.rangeClosed('N', 'Z').mapToObj(var -> "" + (char) var).collect(Collectors.toList());
		
		for(String s : letters)
		{
		list.stream().filter(a -> a.salary > 100000)
		.filter(a -> a.lastName.startsWith(s))
		.map(a-> a.firstName + " " + a.lastName)
		.sorted()
		.collect(Collectors.toList()).forEach(System.out::println);
		}
		
		
	}

}

