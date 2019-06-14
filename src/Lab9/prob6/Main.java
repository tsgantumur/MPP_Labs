package Lab9.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> setList = Arrays.asList(
				new HashSet<>(Arrays.asList("A", "B")),
				new HashSet<>(Arrays.asList("D")),
				new HashSet<>(Arrays.asList("1", "2", "3"))
				);
		
		System.out.println(setList);
		
	}
	
	public Set<String> union(List<Set<String>> sets)
	{
		return null;
		//return sets.stream().map(l -> l.)
		//.collect(Collectors.joining(", "));
	}

}
