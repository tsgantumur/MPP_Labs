package Lab9.prob6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import com.sun.swing.internal.plaf.synth.resources.synth_zh_CN;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> setList = Arrays.asList(
				new HashSet<>(Arrays.asList("A", "B")),
				new HashSet<>(Arrays.asList("D")),
				new HashSet<>(Arrays.asList("1", "3", "5"))
				);
		
		System.out.println(setList);
		System.out.print(union(setList));
		
	}
	
	public static Set<String> union(List<Set<String>> sets)
	{
		
		Set<String> lastSet = sets.parallelStream().reduce(new HashSet(), (a, b) -> {
			Set<String> set = new HashSet(a);
			set.addAll(b);
			return set;
		});
		
		return lastSet;
		
	}

}
