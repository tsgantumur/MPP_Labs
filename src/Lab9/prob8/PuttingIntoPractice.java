package Lab9.prob8;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println("Query 1");
		LambdaLibrary.TRANSACTIONS_FROM_2011.apply(transactions).forEach(System.out::println);
		
		System.out.println("Query 2");
        // Query 2: What are all the unique cities where the traders work?
        LambdaLibrary.UNIQUE_CITIES.apply(transactions).forEach(System.out::println);

        System.out.println("Query 3");
        // Query 3: Find all traders from Cambridge and sort them by name.
        LambdaLibrary.TRADERS_FROM_CAMBRIDGE.apply(transactions).forEach(System.out::println);
   
        System.out.println("Query 4");
        // Query 4: Return a string of all traders names sorted alphabetically.
        LambdaLibrary.TRADERS_NAMES.apply(transactions).forEach(System.out::println);

        System.out.println("Query 5");
        // Query 5: Are there any trader based in Milan?
        LambdaLibrary.TRADERS_FROM_MILAN.apply(transactions).forEach(System.out::println);
   
        System.out.println("Query 6");
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        
        
        System.out.println("Query 7");
        // Query 7: What's the highest value in all the transactions?
        System.out.println(LambdaLibrary.HIGHEST_VALUE.apply(transactions));
    }
}
