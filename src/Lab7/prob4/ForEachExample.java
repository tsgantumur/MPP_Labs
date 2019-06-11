package Lab7.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

import Lab7.prob4.ForEachExample.MyConsumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		ForEachExample fee = new ForEachExample();
		fee.process(list);
	}
	
	public void process(List<String> list)
	{
		MyConsumer mc = new MyConsumer();
		list.forEach(mc);
	}
	
	class MyConsumer implements Consumer<String>
	{
		public void accept(String t)
		{
			System.out.println(t.toUpperCase());
		}
	}
	
}