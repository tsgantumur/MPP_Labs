package Lab9.prob1234;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//prob1
		System.out.println("Lab9 prob1");
		Stream.of("Bill", "Thomas", "Mary").forEach(str-> System.out.print(str + ", "));
		System.out.println();
		
		//prob2
		System.out.println("Lab9 prob2");
		IntSummaryStatistics myIntStream = Stream.of(1, 2, 3, 5, 6).collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Max: " + myIntStream.getMax());
		System.out.println("Min: " + myIntStream.getMin());
		
		//prob3
		List<String> myStrings = Arrays.asList("abca","bac","adbc","dddd","dcba");

		System.out.println("Lab9 prob3");
		long count = 
				myStrings.stream()
				.filter(c -> c.contains("c"))
				.filter(d -> !(d.contains("d")))
				.filter(n -> n.length() == 3)
				.count();
		
		System.out.println("count: " + count);
		
		//prob4
		System.out.println("Lab9 prob4");
		IntStream.iterate(1, n -> n + 1)
		.map(n -> n * n)
		.limit(5)
		.forEach(n -> System.out.print(n + ", "));
		
	}

}
