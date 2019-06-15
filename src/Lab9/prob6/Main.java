package Lab9.prob6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> setList = Arrays.asList(
				new HashSet<>(Arrays.asList("A", "B")),
				new HashSet<>(Arrays.asList("D")),
				new HashSet<>(Arrays.asList("1", "2", "3"))
				);
		
		System.out.println(setList);
		System.out.print(union(setList));
		
	}
	
	public static Set<String> union(List<Set<String>> sets)
	{
		
		return sets.stream().flatMap(Set::stream).collect(Collectors.toSet());
	}

}
