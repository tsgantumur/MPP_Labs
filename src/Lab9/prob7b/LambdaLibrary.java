package Lab9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary 
{
	public static final TriFunction<List<Employee>, String, Integer, List<String>>
		SEARCH_BY_LASTNAME_AND_SALARY = (list, search, salary) -> list.stream().filter(a -> a.salary > salary)
		.filter(a -> a.lastName.startsWith(search))
		.map(a-> a.firstName + " " + a.lastName)
		.sorted()
		.collect(Collectors.toList());
}
