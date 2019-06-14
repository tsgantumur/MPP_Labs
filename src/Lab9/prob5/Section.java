package Lab9.prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n)
	{
		return stream.skip(m)
				.limit(n - m + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> strings = streamSection(nextStream(), 1, 3);
		System.out.println("**********************");
		strings.forEach(System.out::println);
		Stream<String> strings2 = streamSection(nextStream(), 0, 5);
		System.out.println("**********************");
		strings2.forEach(System.out::println);
		Stream<String> strings3 = streamSection(nextStream(), 2, 4);
		System.out.println("**********************");
		strings3.forEach(System.out::println);
	}
	
	private static Stream<String> nextStream()
	{
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
				"iii").stream();
	}

}
