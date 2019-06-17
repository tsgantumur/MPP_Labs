package Lab9.prob8;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaLibrary 
{
	// Query 1: Find all transactions from year 2011 and sort them by value (small to high).
	public static final Function<List<Transaction>, List<String>> TRANSACTIONS_FROM_2011 = 
			(list) -> list.stream().filter(a -> a.getYear() >= 2011)
						.sorted(Comparator.comparing(Transaction::getValue))
						.map(a-> a.getYear() + " " + a.getValue())
						.collect(Collectors.toList());

    
    // Query 2: What are all the unique cities where the traders work?
    public static final Function<List<Transaction>, List<String>> UNIQUE_CITIES = 
    		(list) -> list.stream()
    				.map(a -> a.getTrader().getCity())
    				.distinct()
    				.collect(Collectors.toList());

    // Query 3: Find all traders from Cambridge and sort them by name.
    public static final Function<List<Transaction>, List<Trader>> TRADERS_FROM_CAMBRIDGE =
    		(list) -> list.stream()
    				.filter(a -> a.getTrader().getCity().equalsIgnoreCase("Cambridge"))
    				.sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()))
    				.map(tr -> tr.getTrader())
    				.collect(Collectors.toList());

    
    // Query 4: Return a string of all traders names sorted alphabetically.
    public static final Function<List<Transaction>, List<String>> TRADERS_NAMES =
    		(list) -> list.stream()
    				.map(a -> a.getTrader().getName())
    				.sorted()
    				.collect(Collectors.toList());

    // Query 5: Are there any trader based in Milan?
	public static final Function<List<Transaction>, List<Trader>> TRADERS_FROM_MILAN =
    		(list) -> list.stream()
    				.filter(a -> a.getTrader().getCity().equalsIgnoreCase("Milan"))
    				.sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()))
    				.map(tr -> tr.getTrader())
    				.collect(Collectors.toList());

	// Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
    public static final Function<List<Transaction>, List<Transaction>> UPDATE_TRANSACTIONS =
    		(list) -> list.stream()
    				.peek(t -> t.getTrader().setCity("Cambridge"))
    				.collect(Collectors.toList());
    
    // Query 7: What's the highest value in all the transactions?
    public static final Function<List<Transaction>, String>  HIGHEST_VALUE =
    		(list) -> list.stream()
    				.max(Comparator.comparing(Transaction::getValue))
    				.orElseThrow(NoSuchElementException::new)
    				.toString();
}
