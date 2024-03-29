package Lab9.prob1and2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//prob1
		System.out.println("Lab9 prob1");
		Stream<String> names = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(names.collect(Collectors.toList()));
		System.out.println();
		
		//prob2
		System.out.println("Lab9 prob2");
		IntSummaryStatistics myIntStream = Stream.of(1, 2, 3, 5, 6).collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Max: " + myIntStream.getMax());
		System.out.println("Min: " + myIntStream.getMin());
		


	}
	

	

}
