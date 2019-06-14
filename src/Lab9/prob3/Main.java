package Lab9.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prob3
		List<String> myStrings = Arrays.asList("abca","bac","adbc","dddd","dcba");
		
		int count = countWords(myStrings, 'c', 'd', 3);
		
		System.out.println("count: " + count);
		
	}

	//prob3
	public static int countWords(List<String> words, char c, char d, int len)
	{
		String cc = String.valueOf(c);
		String dd = String.valueOf(d);
		
		return (int) words.stream()
				.filter(x -> x.contains(cc))
				.filter(y -> !(y.contains(dd)))
				.filter(n -> n.length() == len)
				.count();
	}
}
