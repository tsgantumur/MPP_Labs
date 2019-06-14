package Lab9.prob4;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
		printSquares(5);
		printSquares(3);
	}
	
	//prob4
	public static void printSquares(int num)
	{
		IntStream.iterate(1, n -> n + 1)
		.map(n -> n * n)
		.limit(num)
		.forEach(n -> System.out.print(n + ", "));
		
		System.out.println();
	}

}
